package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running InsertionSortTest")
class InsertionSortTest {
	Utility u = new Utility();
	int arr[] = { 2, 7, 19, 5, 14, 6, 18, 12, 10 };
	int[] expectedArr = { 2, 5, 6, 7, 10, 12, 14, 18, 19 };
	int[] actual = u.insertionSortInt(arr, 0, arr.length-1);

	@Test
	@DisplayName("Running InsertionSort method ")
	void test() {
		assertArrayEquals(expectedArr, actual, "should return sorted array");

	}

}
