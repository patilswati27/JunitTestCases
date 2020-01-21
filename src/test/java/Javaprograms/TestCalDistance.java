package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.Utility;

@DisplayName("Running TestCalDistance")
class TestCalDistance {
Utility u=new Utility();
int expected =56;
	@Test
	@DisplayName(" Testing CalDistance method")
	void calDistancetest() {
		assertEquals(expected,Utility.getDistance(3,5));
	}

}
