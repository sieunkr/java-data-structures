package com.example.demo;

import com.googlecode.concurrenttrees.common.PrettyPrinter;
import com.googlecode.concurrenttrees.radix.ConcurrentRadixTree;
import com.googlecode.concurrenttrees.radix.RadixTree;
import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;
import com.googlecode.concurrenttrees.radix.node.util.PrettyPrintable;
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

		RadixTree<Integer> tree = new ConcurrentRadixTree<Integer>(new DefaultCharArrayNodeFactory());

		tree.put("springboot", 1);
		tree.put("springcloud", 2);
		tree.put("springmvc", 3);
		tree.put("sports", 77);

		PrettyPrinter.prettyPrint((PrettyPrintable) tree, System.out);


		//Exact 매칭
		System.out.println("#1. Exact 매칭 테스트");
		System.out.println("springboot (exact match): " + tree.getValueForExactKey("springboot"));
		System.out.println("springcloud (exact match): " + tree.getValueForExactKey("springcloud"));
		System.out.println("springmvc (exact match): " + tree.getValueForExactKey("springmvc"));
		System.out.println("sports (exact match): " + tree.getValueForExactKey("sports"));

		//Prefix 매칭
		System.out.println("#2. Prefix 매칭 테스트");
		System.out.println("spring (prefix match): ");
		StreamSupport.stream(tree.getKeyValuePairsForKeysStartingWith("spring").spliterator(), false)
				.forEach(System.out::println);


	}
}
