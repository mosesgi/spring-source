package com.moses.spring.gpDesignPatterns.singleton;

import java.util.HashMap;
import java.util.Map;


//Spring使用这种方法，将类名注册，下次从Map中直接获取
public class SingletonUsingMap {
	private static Map<String, SingletonUsingMap> map = new HashMap<>();
	static {
		SingletonUsingMap single = new SingletonUsingMap();
		map.put(SingletonUsingMap.class.getName(), single);
	}
	
	protected SingletonUsingMap() {}
	
	public static SingletonUsingMap getInstance(String name) {
		if(name == null) {
			name = SingletonUsingMap.class.getName();
		}
		if(map.get(name) == null) {
			try {
				map.put(name, (SingletonUsingMap)Class.forName(name).newInstance());
			} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return map.get(name);
	}
}
