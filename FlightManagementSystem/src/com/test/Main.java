package com.test;

public class Main {
	
	public static void main(String[] args) {
		
		
		
		Flight f1=new Flight("f001", "pune", "kolhapur", "4", "9", false);
		Flight f2=new Flight("f002", "chennai", "mumbai", "4", "9", false);
		Flight f3=new Flight("f003", "pune", "ratnagiri", "4", "9", false);
		Flight f4=new Flight("f004", "indore", "chennai", "4", "9", false);
		
	     System.out.println(f1);
		
		f1.bookFlight();
		
		System.out.println(f1);
		
		f1.bookFlight();
		
		f1.cancelBooking();
		
		
		
		Passenger p1=new Passenger("rohit", "PN1111");
		Passenger p2=new Passenger("virat", "PN2222");
		Passenger p3=new Passenger("rishab", "PN3333");
		Passenger p4=new Passenger("sky", "PN4444");
		
		System.out.println(p1);
		
		p1.bookFlight(f1);
		
		System.out.println(p1);
		
		p2.bookFlight(f2);
		System.out.println(p2);
		
	 
		p3.bookFlight(f3);
		
		p3.cancelBooking(f3);
		
		
		Airline air = new Airline();
		
		air.addFlight(f4);
		System.out.println(air);
		
		air.registerPassenger(p4);
		System.out.println(air);
		
		 String testString = "India won the match";
	        System.out.println("Original String: " + testString);
	        System.out.println("Number of 's': " + Unity.countOccurrences(testString, 's'));
	        System.out.println("Reversed String: " + Unity.reverseString(testString));
	        System.out.println("Is Palindrome: " + Unity.isPalindrome(testString));
	        System.out.println("Capitalized Words: " + Unity.capitalizeWords(testString));
	        
	        Integer[] numbers = {10, 20, 35, 15};
	        System.out.println("Maximum Value: " + WapperUnity.findMax(numbers));
	        Double[] decimals = {2.5, 3.8, 1.2};
	        System.out.println("Average: " + WapperUnity.calculateAverage(decimals));
	        String binaryString = "1011";
	        System.out.println("Converted to Boolean Array: " + java.util.Arrays.toString(WapperUnity.convertToBooleanArray(binaryString)));
	        

	}

}
