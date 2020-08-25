package com.demo.threads;

public class MyThread extends Thread {
	private String name;

	public MyThread(String name) {
		this.name = name;
		this.setName(name);
	}

	@Override
	public void run() {
		try {
			for(int i=0;i<10;i++) {
				System.out.println("Thread Name "+Thread.currentThread().getName());
				Thread.sleep(2000);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
