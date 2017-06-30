package com.leqee.test;

public class Implemention1 implements Service {
	public void method1() {
		System.out.println("In Implemention1 method method1()");
	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implemention1();
		}
	};
}