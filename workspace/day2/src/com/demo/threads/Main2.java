package com.demo.threads;

public class Main2 {

	public static void main(String[] args) throws InterruptedException{
		System.out.println("main starts here...");
		
		Thread t1=new Thread(new Worker(),"Rocky");
		t1.start();

		t1.join();
		System.out.println("Main ends here...");
	}

}
