package com.practice_project.learn_functional_programming.programming;

import java.util.List;

public class Challenge1Structured {

	public static void main(String[] args) {

		//List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "AZURE", "Docker", "Kubernetes");
		
		//printAllNumbersInListStructured(numbers);
		//printEvenNumbersInListStructured(numbers);
		//printOddNumbersInListStructured(numbers);
		
		// Print the courses individually.
//		courses.stream()
//			  .forEach(System.out::println);
		
		// Print all the courses containing the word "Spring".
//		courses.stream()
//		  .filter(course -> course.contains("Spring"))
//		  .forEach(System.out::println);
		
		// Print the course names that contain at least 4 letters.
		courses.stream()
		  .filter(course -> course.length() >= 4)
		  .forEach(System.out::println);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How do we loop all the numbers?
		for (int number : numbers) {
			System.out.println(number);
		}

	}

	// What if we only want to print all the even numbers in the list?
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		// How do we loop all the numbers?
		for (int number : numbers) {
			// if(even), print the number out.
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}

	}
	
	// What if we only want to print the odd numbers in the list?
	private static void printOddNumbersInListStructured(List<Integer> numbers) {
		// How do we loop all the numbers?
		for (int number : numbers) {
			if (number % 2 != 0)
			System.out.println(number);
		}

	}
}
