package com.zbss;

/**
 * Created by zhaobing on 2017/7/9.
 */
public class ThriftHelloServiceImpl implements Thrift.Iface {
	@Override
	public String hello(String name) {
		return "hello "+name;
	}
}
