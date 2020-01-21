package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running PrimeNoTest")
class PrimeNoTest {
	Utility u = new Utility();

	@Test
	@DisplayName("Testing isPrime method ")
	void isPrimetest() {
		assertEquals(true,u.isPrime(55),"should check given no is prime or not");
	}

}
