package com.example.demo;

import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;
import com.googlecode.concurrenttrees.radixreversed.ConcurrentReversedRadixTree;
import com.googlecode.concurrenttrees.radixreversed.ReversedRadixTree;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.stream.StreamSupport;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		ReversedRadixTree<Integer> tree = new ConcurrentReversedRadixTree<Integer>(new DefaultCharArrayNodeFactory());

		tree.put("springboot", 1);
		tree.put("springcloud", 2);
		tree.put("springmvc", 3);
		tree.put("sports", 77);

		//Exact 매칭
		System.out.println("#1. Exact 매칭 테스트");
		System.out.println("springboot (exact match): " + tree.getValueForExactKey("springboot"));
		System.out.println("springcloud (exact match): " + tree.getValueForExactKey("springcloud"));
		System.out.println("springmvc (exact match): " + tree.getValueForExactKey("springmvc"));
		System.out.println("sports (exact match): " + tree.getValueForExactKey("sports"));


		//Reverse 매칭
		System.out.println("#2. Reverse Suffix 매칭 테스트");
		System.out.println("(reverse suffix match): ");
		StreamSupport.stream(tree.getKeyValuePairsForKeysEndingWith("boot").spliterator(), false)
				.forEach(System.out::println);


	}
}
