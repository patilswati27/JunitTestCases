package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.MergeSortAlgo;

@DisplayName("Running MergeSortAlgoTest")
class MergeSortAlgoTest {
	MergeSortAlgo sort = new MergeSortAlgo();
	int[] arr = { 6, 8, 6, 3, 2, 1, 0, 66, 78, 12 };
	int[] expected = { 0, 1, 2, 3, 6, 6, 8, 12, 66, 78 };
	int[] actual = sort.mergeSort(arr, 0, arr.length - 1);

	@Test
	@DisplayName("Testing MergeSort method ")
	void testMergeSort() {
		assertArrayEquals(expected, actual, "Should return sorted array");
	}

	@Test
	@DisplayName("Testing MergeSort method for single input")
	void test() {
		int[] arr = { 1 };
		int[] expected = { 1 };
		int[] actual = sort.mergeSort(arr, 0, arr.length - 1);

		assertArrayEquals(expected, actual, "Should return sorted array");
	}

}
