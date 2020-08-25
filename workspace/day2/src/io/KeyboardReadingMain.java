package io;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyboardReadingMain {

	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int data = 0;
		while (true) {
			String line=br.readLine();
			/*
			 * data=br.read(); char ch=(char) data; if(ch=='q') break;
			 */
			if(line.equalsIgnoreCase("EXIT")) break;
			System.out.print(line);
		}

	}

}
