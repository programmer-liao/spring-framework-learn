package com.dezhi.learn.spring.ioc.step02;

/**
 * C采用set方法注入A
 */
public class C {
	private String name = "C";

	private A a;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
