package com.demo;

public class Outer {

	private int data = 20;

	class Inner1 {

		public Inner1() {
			System.out.println("Object of Inner1 created..");
		}

		public void doIt() {
			System.out.println("From Inner1 class : " + data);
		}
	}

	static class Inner2 {
		private int data = 50;

		public Inner2() {
			System.out.println("Object of Inner2 created..");
		}

		public void doIt() {
			System.out.println("From Inner2 class : " + data);
		}
	}

}
