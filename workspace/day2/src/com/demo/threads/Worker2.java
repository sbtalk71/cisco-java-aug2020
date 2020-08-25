package com.demo.threads;

class Worker2 implements Runnable {

	private MessagePrinter printer;
	private String message;

	public Worker2(MessagePrinter printer, String message) {
		this.printer = printer;
		this.message = message;
	}

	@Override
	public void run() {
		try {
			synchronized (printer) {
				printer.print(message);
			}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
