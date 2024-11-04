package com.practice_project.learn_functional_programming.programming;

import java.util.List;

public class Challenge1Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(12,9,13,4,6,2,4,12,15));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		// How do we loop all the numbers?
		for(int number : numbers) {
			System.out.println(number);
		}
		
	}

}
