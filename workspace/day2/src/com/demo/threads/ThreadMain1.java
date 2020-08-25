package com.demo.threads;

public class ThreadMain1 {

	public static void main(String[] args) {
		
	Thread t1=	new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Hi, I am from another Thread :"+Thread.currentThread().getName());
				
			}
			
		});
		
		t1.start();
		
		Thread t2=	new Thread(()-> {
				System.out.println("Hi, I am from another Thread :"+Thread.currentThread().getName());
				
			}
			
		);

		t2.start();
		
		//t1.start();
		
	}

}
