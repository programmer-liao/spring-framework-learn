package com.dezhi.learn.spring.ioc.step02.test;

import com.dezhi.learn.spring.ioc.step02.A;
import com.dezhi.learn.spring.ioc.step02.B;
import com.dezhi.learn.spring.ioc.step02.C;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class ApiTests {

	/**
	 * 测试循环依赖
	 */
	@Test
	@SuppressWarnings("deprecation")
	public void test_CyclicDependence() {
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("spring-bean.xml"));
		A a = (A) xmlBeanFactory.getBean("a");
		B b = (B) xmlBeanFactory.getBean("b");
		C c = (C) xmlBeanFactory.getBean("c");
		System.out.println(a.getName());
		System.out.println(b.getName());
		System.out.println(c.getName());

	}
}
