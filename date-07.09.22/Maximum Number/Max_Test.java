package com.unit.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Max_Test {

	@Test
	void test() {
		MaxNum ob=new MaxNum();
		int arr[]= {60,30,70,10};
		int actual=ob.Max(arr);
		int expected=70;
		assertEquals(expected,actual);
	}

}
