package com.practice_project.learn_functional_programming.programming;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
	public static void main(String[] args) {
	List<String> fruits = List.of("apple", "banana", "mango");
	
	Predicate<? super String> predicate = fruit -> fruit.startsWith("b");  // If we change "b" to "c", we get a null pointer exception.
	Optional<String> optional = fruits.stream().filter(predicate).findFirst();
	System.out.println(optional);
	System.out.println(optional.isEmpty());
	System.out.println(optional.isPresent());
	System.out.println(optional.get());  // Returns the specific value containing the "b".

	// If there is a chance that one of your values will return as empty, it is recommended that you use Optional.
	Optional<String> fruit = Optional.of("banana");
	Optional<String> empty = Optional.empty();  // Instead of using null to represent empty values, it is recommended to use Optional.
	
	
	}

}
