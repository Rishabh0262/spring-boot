package com.in28minutes.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

//		Way 1 : The most basic.
	@Test
	void test() {
		int [] nums = {1,2,3};
		MyMath math1 = new MyMath();
		int res = math1.calculateSum(nums);
		System.out.println(res);
		int expectedResult = 6;
		assertEquals(expectedResult, res);
		
//		Run As : JUnit Test 
//		check console... for sysout res
	}
	
	
//		Way 2 : used rt-clk -> refactor > inline,      on "nums", "res", "expectedResult"
	@Test
	void test1() {
		MyMath math1 = new MyMath();
		int expectedResult = 12;
		assertEquals(expectedResult, math1.calculateSum(new int[] {1,2,2,2,2,3}));
	}
	
//		way 3 : we can use the Class-Obj as global var.
	private MyMath math = new MyMath();
	
	@Test
	void CalculateSum_ZeroLengthArray() {
		assertEquals(0, math.calculateSum(new int[] {}));
	}
	
	@Test
	void CalculateSum_ThreeMemberArray() {
		assertEquals(3, math.calculateSum(new int[] {1,1,1}));
	}
	
	
}
