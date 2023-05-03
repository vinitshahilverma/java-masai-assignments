package com.masai;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Revision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
//		
//		List<Integer> sum = numbers.stream()
//				         .filter( n -> n%2 !=0)
//				         .map(n -> n*n)
//				         .collect(Collectors.toList());
//                        
//		
//		System.out.println(sum);
		
//		Stream.iterate(0, n -> n+1)
//		      .limit(10)
//		      .forEach(System.out::print);
		
//		List<String> words = Arrays.asList("cat" ,"dog", "bird","elephant");
//		
//		String result = words.stream()
//				             .filter(w -> w.length()>3)
//				             .findFirst()
//				             .orElse("No word found");
//		
//		System.out.println(result);
		
//		List<String> words = Arrays.asList("apple" ,"banana","orange");
//		
//		String result = words.stream()
//				             .map(w -> w.toUpperCase())
//				             .reduce("", (a,b) -> a+b);
//		
//		
//		System.out.println(result);
		
//		IntStream.rangeClosed(1, 5)
//		          .boxed()
//		          .flatMap(i -> IntStream.rangeClosed(1, i).boxed())
//		          .forEach(System.out::print);
		
//		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		
//		Optional<Integer> result = nums.stream()
//				                       .filter(n -> n%2 == 0)
//				                       .map(n -> n*n)
//				                       .reduce((a,b) -> a+b);
//		
//		System.out.println(result.orElse(-1));
		
//		Stream<String> words = Stream.of("apple","banana","cherry");
//		
//		List<String> result = words.collect(Collectors.toUnmodifiableList());
//		
//		System.out.println(result.get(1));
		
//		Function<Integer,Integer> addOne = x -> x+1;
//		
//		Function<Integer,Integer> doubleIt = x -> x*x;
//		
//		int result  = addOne.andThen(doubleIt).apply(2);
//		
//		System.out.println(result);
		
//		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		
//		int result = nums.stream()
//				         .reduce(0,(a,b) -> a+b);
//		
//		System.out.println(result);
		
		
//		Predicate<String> a = s -> s.startsWith("A");
//		
//		Predicate<String> b = s -> s.startsWith("B");
//		
//		Predicate<String> combined = a.and(b);
//		
//		List<String> words = Arrays.asList("Apple" ,"Banana","Cheery");
//		
//		List<String> result = words.stream()
//				                   .filter(combined)
//                                   .collect(Collectors.toList());
//		
//		System.out.println(result);
		
//		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		
//		Function<Integer,Integer> addOne  = x -> x+1;
//		
//		List<Integer> result =  nums.stream()
//				                    .map(addOne)
//				                    .collect(Collectors.toList());
//		
//		System.out.println(result);
		
//		Stream.iterate(0, i -> i+2)
//		      .limit(5)
//		      .forEach(System.out::println);
		
//		Function<String,Integer> length = String::length;
//		
//		List<Integer> result = (List<Integer>) Stream.of("apple","banana", "cherry")
//				                                     .map(length)
//				                                     .sorted()
//				                                     .collect(Collectors.toList());
//		
//		System.out.println(result);
		
//		List<Integer> nums = Arrays.asList(1,2,3,4,5);
//		
//		UnaryOperator<Integer> doubleNum = x-> x*2;
//		
//		UnaryOperator<Integer> addOne = x -> x+1;
//		
//		List<Integer> result = nums.stream()
//				                   .map(doubleNum.andThen(addOne))
//				                   .collect(Collectors.toList());
//		
//		System.out.println(result);
		
		
//		Predicate<Integer> isEven = x -> x%2 == 0;
//		
//		long count = Stream.of(1,2,3,4,5)
//				          .filter(isEven.negate())
//				          .count();
//		
//		System.out.println(count);
		
//		List<String> words = Arrays.asList("hello", "world","java");
//		
//		Predicate<String> j = s -> s.startsWith("j");
//		
//		List<String> result = words.stream()
//				                   .filter(j.negate())
//				                   .map(String::toUpperCase)
//				                   .collect(Collectors.toList());
//		System.out.println(result);
		
//		Stream<Integer> ints = Stream.iterate(1, i -> i + 2).limit(3);
//		
//		Function<Integer,Integer> addOne = i -> i+ 1;
//		
//		List<Integer> result = ints.map(addOne)
//				                   .collect(Collectors.toList());
//		
//		System.out.println(result);
		
	List<String> words = Arrays.asList("apple","banana","cheery","date");
	
	 Function<String,String> removeVowels = s -> s.replaceAll("[aeiou]", "");
	 
	 String result = words.stream()
			               .map(removeVowels)
			               .collect(Collectors.joining("-"));
	 
	 System.out.println(result);
		
	}                              

}
