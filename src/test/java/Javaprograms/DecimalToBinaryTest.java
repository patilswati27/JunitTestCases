package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running DecimalToBinaryTest")
class DecimalToBinaryTest {
	@Nested
	class ToBinary {
		Utility u = new Utility();
		int ActualArr[] = u.toBinary(10);
		int ExpectedArr[] = { 1, 0, 1, 0 };

		@Test
		@Disabled
		@DisplayName("Testing toBinary method ")
		void toBinaryTest() {
			int ActualArr[] = u.toBinary(10);
			int ExpectedArr[] = { 1, 0, 1, 0 };
			assertArrayEquals(ExpectedArr, ActualArr, "Should convert dec to binary number");
		}

		@Test
		@DisplayName("Testing toBinary method for exception handling")
		void ToBinaryTest() {
			assertThrows(IllegalArgumentException.class, () -> u.toBinary(-10));
		}

		@Test
		@DisplayName("Testing nibblesSwap method ")
		void nibblesSwapTest() {
			assertSame(5, u.nibbleSwap(ActualArr));
		}
	}
}