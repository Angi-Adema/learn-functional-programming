package com.practice_project.learn_functional_programming.programming;

import java.util.List;

public class Challenge1Functional {

	public static void main(String[] args) {
		
		printAllNumbersInListFunctional(List.of(12,9,13,4,6,2,4,12,15));

	}
	
	private static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		
		// In a functional approach, we focus on what to do. We want to convert the list of numbers [12,9,13,4,6,2,4,12,15] into a stream of numbers or sequence of numbers on their own line.
		// Instead of getting a list like this: [12,9,13,4,6,2,4,12,15], we get a stream where the numbers are printed sequentially on a separate line.
		numbers.stream()
			.forEach(Challenge1Functional::print);  // Name of the class followed by the name of the method. For each element, the Challenge1Functional class is called and the print method is executed.
		
		// How do we loop all the numbers?
//		for(int number : numbers) {
//			System.out.println(number);
//		}
		
	}

}
