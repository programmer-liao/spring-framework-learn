package com.dezhi.learn.spring.ioc.step02;

/**
 * A采用set方法注入B
 */
public class A {

	private String name = "A";
	private B b;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
