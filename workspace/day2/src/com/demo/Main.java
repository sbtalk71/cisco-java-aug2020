package com.demo;

public class Main {

	public static void main(String[] args) {

		Greeting g = new GoodMorning();
		System.out.println(g.getGreeting());

		Greeting g1 = new GoodEvening();
		System.out.println(g1.getGreeting());

		Greeter greeter = new Greeter();

		greeter.greet(g);
		greeter.greet(g1);
		
		
		Greeting afternoon = new Greeting() {

			@Override
			public String getGreeting() {
				
				return "Good Afternoon";
			}
			
			
		};
		
		greeter.greet(afternoon);
		
		Greeting happyNewYear=()->"Happy New Year 2019";
		
		greeter.greet(happyNewYear);
		
		greeter.greet(()->"Hi all, are you OK?");
		
	}

}

class GoodMorning implements Greeting {

	@Override
	public String getGreeting() {

		return "Good Morning";
	}

}

class GoodEvening implements Greeting {

	@Override
	public String getGreeting() {

		return "Good Evening";
	}

}