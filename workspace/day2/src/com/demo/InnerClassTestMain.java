package com.demo;

import com.demo.Outer.Inner1;
import com.demo.Outer.Inner2;

public class InnerClassTestMain {

	public static void main(String[] args) {
		Outer o1=new Outer();
		
		Inner1 i1=o1.new Inner1();
		
		Inner2 i2=new Inner2();

	}

}
