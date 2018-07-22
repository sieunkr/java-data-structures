package com.example.demo;

import com.googlecode.concurrenttrees.common.Iterables;
import com.googlecode.concurrenttrees.radix.node.concrete.DefaultCharArrayNodeFactory;
import com.googlecode.concurrenttrees.radixinverted.ConcurrentInvertedRadixTree;
import com.googlecode.concurrenttrees.radixinverted.InvertedRadixTree;
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
        
        InvertedRadixTree<Integer> tree = new ConcurrentInvertedRadixTree<Integer>(new DefaultCharArrayNodeFactory());

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

        //Prefix 매칭
        System.out.println("#2. Prefix 매칭 테스트");
        System.out.println("spring (prefix match): ");
        StreamSupport.stream(tree.getKeyValuePairsForKeysStartingWith("spring").spliterator(), false)
                .forEach(System.out::println);


        /*
            ContainedIn 매칭

            getKeysContainedIn
            getValuesForKeysContainedIn
            getKeyValuePairsForKeysContainedIn
         */
        System.out.println("#3. ContainedIn 매칭 테스트");
        System.out.println("(ContainedIn match): ");
        StreamSupport.stream(tree.getKeyValuePairsForKeysContainedIn("springcloud builds on springboot by providing a bunch of libraries that enhance the behaviour of an application when added to the classpath.").spliterator(), false)
                .forEach(System.out::println);


	}
}
