package com.practice_project.learn_functional_programming.programming;

import java.util.List;

public class Challenge1Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
		
		//printAllNumbersInListFunctional(numbers);
		//printEvenNumbersInListFunctional(numbers);
		//printOddNumbersInListFunctional(numbers);
		//printSquaresOfEvenNumbersInListFunctional(numbers);
		printCubeOfOddNumbersInListFunctional(numbers);

	}
	
//	private static void print(int number) {
//		System.out.println(number);
//	}
	
	// Check if the number in number is even or not. Now that we have a lambda, we do not need this method any more.
//	private static boolean isEven(int number) {
//		return number % 2 == 0;
//	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		// In a functional approach, we focus on what to do. We want to convert the list of numbers [12,9,13,4,6,2,4,12,15] into a stream of numbers or sequence of numbers on their own line.
		// Instead of getting a list like this: [12,9,13,4,6,2,4,12,15], we get a stream where the numbers are printed sequentially on a separate line.
		numbers.stream()
			//.forEach(Challenge1Functional::print);  // Name of the class followed by the name of the method. For each element, the Challenge1Functional::print method is called.
		      .forEach(System.out::println);  // System.out contains a static method called println. We can dynamically call this and we no longer need the print method above.
		
		// How do we loop all the numbers?
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		
	}
	
	// How do we print the even numbers in a functional approach?
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		
		numbers.stream()
			  // To print only the even numbers, we add a Filter to only print the even numbers. We want to call isEven on all the numbers and if it is even then proceed to the action of printing.
			 // .filter(Challenge1Functional::isEven)
			  .filter(number -> number % 2 == 0)   // We define a lambda expression rather than just the filter and method reference. Take number as the parameter and check if number % 2 == 0 and return it back.
		      .forEach(System.out::println);  
		
	}
	
	// How do we print the odd numbers in a functional approach?
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			  .filter(number -> number % 2 != 0)
			  .forEach(System.out::println);
	}
	
	// How do we print the squares of each even number?
	private static void printSquaresOfEvenNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			  .filter(number -> number % 2 == 0)
			  // We want to map the number and print the square of the number (mapping - x -> x * x)
			  .map(number -> number * number)
			  .forEach(System.out::println);
	}
	
	// How do we print the cube of each odd number?
	private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
			  .filter(number -> number % 2 != 0)
			  // We want to map the number and print the square of the number (mapping - x -> x * x)
			  .map(number -> number * number * number)
			  .forEach(System.out::println);
	}

}

// In the structural approach, we have to focus on how to move the numbers and then print them. Here in the functional approach, we get a list of elements and then define what we want to do with each of them.
// We are saying that for each element in the stream, do a print for each one.
