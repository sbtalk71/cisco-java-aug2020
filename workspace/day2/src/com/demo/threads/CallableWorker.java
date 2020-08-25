package com.demo.threads;

import java.util.concurrent.Callable;

class CallableWorker implements Callable<Integer> {

	@Override
	public Integer call() {
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Thread Name " + Thread.currentThread().getName());
				Thread.sleep(2000);
			}

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		return 1;
		
	}

}
