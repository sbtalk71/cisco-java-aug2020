package com.demo.threads;

public class SynchMain {

	public static void main(String[] args) throws Exception {
		MessagePrinter printer = new MessagePrinter();

		Thread t1 = new Thread(new Worker2(printer, "Hello"));
		Thread t2 = new Thread(new Worker2(printer, "Good"));
		Thread t3 = new Thread(new Worker2(printer, "World"));

		t1.start();
		t2.start();
		t3.start();

		t1.join();
		t2.join();
		t3.join();
	}

}
