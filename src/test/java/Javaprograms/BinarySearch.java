package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running BinarySearch")
class BinarySearch {
	Utility u = new Utility();

	@Test
	@DisplayName("Running BinarySearch method")
	void test() {
		int[] arr = { 1, 2, 4, 5, 7, 8, 9, 10 };
		assertEquals(3, u.integerBinarySearch(arr, 0, arr.length, 5));
	}

	@Test
	@DisplayName("Running BinarySearch method for negative value")
	void Test() {
		int[] arr = { 1, 2, 4, 5, -7, 8, 9, 10 };
		assertEquals(4, u.integerBinarySearch(arr, 0, arr.length, -7));
	}
}
