package com.demo.threads;

public class Main {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main starts here...");
		MyThread t1 = new MyThread("Rocky");
		t1.start();

		t1.join();
		System.out.println("Main ends here...");
	}

}
