package com.demo.threads;

public class MessagePrinter {

	public /*synchronized*/ void print(String message) {
		try {
			System.out.print("[" + message);
			Thread.sleep(5000);
			System.out.println("]");
		} catch (Exception e) {

		}
	}
}
