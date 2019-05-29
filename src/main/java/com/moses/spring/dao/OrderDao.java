package com.moses.spring.dao;


import org.springframework.stereotype.Repository;

@Repository
public class OrderDao {
	private String flag = "1";

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	@Override
	public String toString() {
		return "OrderDao [flag=" + flag + "]";
	}
	
	
}
