package com.moses.framework.jdbcOrm.dao;

import java.util.List;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

import com.moses.framework.jdbcOrm.BaseDaoSupport;
import com.moses.framework.jdbcOrm.QueryRule;
import com.moses.framework.jdbcOrm.entity.Member;

@Repository
public class MemberDao extends BaseDaoSupport<Member, Long> {

	@Override
	protected String getPKColumn() {
		return "id";
	}

	@Resource(name = "dataSource")
	protected void setDataSource(DataSource dataSource) {
		super.setDataSourceReadOnly(dataSource);
		super.setDataSourceWrite(dataSource);
	}

	public List<Member> selectByName(String name) throws Exception {
		QueryRule queryRule = QueryRule.getInstance().andEqual("name", name).addAscOrder("name").addAscOrder("id");

		return super.find(queryRule);
	}

	public List<Member> selectAll() throws Exception {
		return super.getAll();
	}

	public boolean insertOne(Member m) throws Exception {
		Long id = super.insertAndReturnId(m);
		m.setId(id);
		return id > 0;
	}

	public boolean updateOne(Member m) throws Exception {
		long count = super.update(m);
		return count > 0;
	}

	public boolean deleteOne(Member m) throws Exception {
		long count = super.delete(m);
		return count > 0;
	}

}
