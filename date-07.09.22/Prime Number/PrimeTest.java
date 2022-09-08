package com.unit.project1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PrimeTest {

	@ParameterizedTest
	@ValueSource(ints= {3,5,7,9,12,8,4,6,11,15,14,2})
	void test_prime(int a) {
		for (int i=2; i<a/2;i++) {
			assertFalse(a%i==0);
		}
	}

}
