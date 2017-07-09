package com.zbss;

/**
 * Created by zhaobing on 2017/7/9.
 */
public class HelloServiceImpl implements HelloService {
	public String hello(String name) {
		return "hello "+name;
	}
}
