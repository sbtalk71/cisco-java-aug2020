package com.demo;

import java.util.Arrays;
import java.util.List;

public class TestStream {

	public static void main(String[] args) {
		
		List<String> names=Arrays.asList("shantanu","Mira","julie","amit","kirti","raja","shanti","Shankar");
		
		names.stream().filter(s->s.contains("i")).forEach(s->System.out.println(s));

	}

}
