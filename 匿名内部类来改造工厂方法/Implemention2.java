package com.leqee.test;

public class Implemention2 implements Service {
	public void method1() {
		System.out.println("in Implemention2 method method1()");
	}

	public static ServiceFactory factory = new ServiceFactory() {
		public Service getService() {
			return new Implemention2();
		}
	};
}