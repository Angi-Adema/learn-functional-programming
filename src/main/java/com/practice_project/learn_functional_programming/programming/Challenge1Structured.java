package com.practice_project.learn_functional_programming.programming;

import java.util.List;

public class Challenge1Structured {

	public static void main(String[] args) {

		List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
		
		//printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);

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

}
