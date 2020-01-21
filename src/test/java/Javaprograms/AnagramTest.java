package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestReporter;

import JavaPrograms.Utility;

@DisplayName("Running AnagramTest")
class AnagramTest {
	Utility u = new Utility();
	TestInfo testinfo;
	TestReporter TestReporter;

	@BeforeEach
	public void init(TestInfo testinfo, TestReporter TestReporter) {
		this.testinfo = testinfo;
		this.TestReporter = TestReporter;
	}

	@Test
	@DisplayName("Testing isAnagram method")
	void isAnagramtest() {
		TestReporter.publishEntry("Running " + testinfo.getDisplayName() + " with method " + testinfo.getTestMethod());
		assertAll(() -> assertEquals("peek and KEEp are anagram", u.isAnagram("peek", "KEEp")),
				  () -> assertEquals("abc and CBA are anagram", u.isAnagram("abc", "CBA")),
				  () -> assertEquals("joy and ENjoy are not anagram", u.isAnagram("joy", "ENjoy")));
	}
}
