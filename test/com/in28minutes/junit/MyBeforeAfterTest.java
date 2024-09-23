package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyBeforeAfterTest {
	
	@BeforeAll
	void beforeAll() {
		
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before each test, This is basically for the 'Set up before each test case'.");
	}

//	These test1,2,3  doesn't guaranteed to be executed in order.
	@Test
	void test() {
		System.out.println("Test1");
	}

	@Test
	void test2() {
		System.out.println("Test2");
	}
	
	@Test
	void test3() {
		System.out.println("Test3");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After each test, This is basically for the 'Clean up after each test case'.");
	}
	
	
	
}
