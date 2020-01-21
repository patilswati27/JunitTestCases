package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running TemperatureConversion")
class TemperatureConversion {
	Utility u = new Utility();
	int Actual = u.CelsiusToFahrenheit(32);
	int actual = u.FahrenheitToCelsius(89);

	@Test
	@DisplayName("Running CelsiusToFahrenheit method")
	void CelsiusToFahrenheitTest() {
		assertEquals(89, Actual, "Should return temp in fahrenheit ");
	}

	@Test
	@DisplayName("Running FahrenheitToCelsius method")
	void FahrenheitToCelsiusTest() {
		assertEquals(31, actual, "Should return temp in celsius ");
	}

}
