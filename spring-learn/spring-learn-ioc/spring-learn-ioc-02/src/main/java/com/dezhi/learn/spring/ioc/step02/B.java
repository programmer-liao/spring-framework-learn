package com.dezhi.learn.spring.ioc.step02;

/**
 * B采用构造器注入C（这里没别的意思，就想尝试不同注入方式）
 */
public class B {

	private String name = "B";

	private final C c;

	public B(C c) {
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public C getC() {
		return c;
	}

}
