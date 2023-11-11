package com.dezhi.learn.spring.ioc.step01.test;

import com.dezhi.learn.spring.ioc.step01.MyTestBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MyTestBeanTests {


	/**
	 * 简单测试一下IOC
	 */
	@Test
	@SuppressWarnings("deprecation")
	// 注意：XmlBeanFactory已经被deprecation
	public void testIOC() {
		// 获取XmlBeanFactory
		XmlBeanFactory xmlBeanFactory = new XmlBeanFactory(new ClassPathResource("MyTestBean.xml"));
		// 获取Bean
		MyTestBean myTestBean = (MyTestBean) xmlBeanFactory.getBean("myTestBean");
		Assertions.assertEquals("testStr", myTestBean.getTestStr());
		System.out.println(myTestBean.getTestStr());
		// 获取BeanDefinition
		BeanDefinition myTestBeanDefinition = xmlBeanFactory.getBeanDefinition("myTestBean");
		// 打印属性值
		System.out.println("BeanClassName: " + myTestBeanDefinition.getBeanClassName());
		System.out.println("Description: " + myTestBeanDefinition.getDescription());
		System.out.println("ParentName: " + myTestBeanDefinition.getParentName());
		System.out.println("DestroyMethodName: " + myTestBeanDefinition.getDestroyMethodName());
		System.out.println("FactoryBeanName: " + myTestBeanDefinition.getFactoryBeanName());
		System.out.println("InitMethodName: " + myTestBeanDefinition.getInitMethodName());
		System.out.println("Scope: " + myTestBeanDefinition.getScope());
		System.out.println("Role: " + myTestBeanDefinition.getRole());
		System.out.println("ResourceDescription: " + myTestBeanDefinition.getResourceDescription());

		System.out.println("isSingleton: " + myTestBeanDefinition.isSingleton());
		System.out.println("Abstract: " + myTestBeanDefinition.isAbstract());
		System.out.println("isPrototype: " + myTestBeanDefinition.isPrototype());
		System.out.println("isPrimary: " + myTestBeanDefinition.isPrimary());
		System.out.println("isLazyInit: " + myTestBeanDefinition.isLazyInit());
		System.out.println("isAutowireCandidate: " + myTestBeanDefinition.isAutowireCandidate());

	}
}
