package com.zbss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by zhaobing on 2017/7/9.
 */
public class Bootstrap {
	public static void main(String[] args) throws Exception {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-dubbo.xml");
		System.out.println("sever start !");

//		HelloService helloService = (HelloService) ctx.getBean("helloService");

		Thrift.Iface helloService = (Thrift.Iface) ctx.getBean("thriftHelloService");
		String str = helloService.hello("ZHANG SAN");

		System.out.println(str);

	}
}
