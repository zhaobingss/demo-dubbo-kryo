package com.zbss;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhaobing on 2017/7/9.
 */
public class Bootstrap {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath*:spring-dubbo.xml"});
		System.out.println("sever start !");
	}
}
