package com.demo.threads;

import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) throws Exception {
		//ExecutorService service = Executors.newFixedThreadPool(4);

		ExecutorService service = Executors.newCachedThreadPool();
		ArrayList<CallableWorker> threads = new ArrayList<>();
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());
		threads.add(new CallableWorker());

		service.invokeAll(threads);

		service.shutdown();
	}
}