package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running TestLeapYear")
class TestLeapYear {
	Utility u = new Utility();
	boolean actual = u.isLeapYear(2000);

	@Test
	@DisplayName("Running TestLeapYear")
	void isleapYeartest() {
		assertSame(true, actual, "should check leap year");
	}

}
