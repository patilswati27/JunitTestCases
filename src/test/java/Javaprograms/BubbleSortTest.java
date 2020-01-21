package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running BubbleSortTest")
class BubbleSortTest {
	Utility u = new Utility();
	int expectedArr[] = { 1, 2, 3, 4, 5, 8, 8 };
	int arr[] = { 4, 2, 1, 8, 5, 8, 3 };
	String array[] = {"java", "c", "python", "R", "php"};
	String strArray[] = {"python", "R", "c", "php", "java"};

	@Test
	@DisplayName("Testing bubbleSortInt method")
	void bubbleSortIntTest() {
		assertArrayEquals(expectedArr, u.bubbleSortInt(arr, 0, arr.length), "should return sorted array");
	}

	@Test
	@DisplayName("Testing bubbleSortStr method")
	void bubbleSortStrTest() {
		assertArrayEquals(strArray, u.bubbleSortStr(array, 0, array.length), "should return sorted string array");
	}

}
