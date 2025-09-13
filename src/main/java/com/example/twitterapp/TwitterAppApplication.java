package com.example.twitterapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.function.Function;
import java.util.function.Predicate;

@SpringBootApplication
public class TwitterAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterAppApplication.class, args);
		Function<Integer, Integer> f = i -> i*i;
		Predicate<Integer> p = i -> i%10 ==0;
	}

}
