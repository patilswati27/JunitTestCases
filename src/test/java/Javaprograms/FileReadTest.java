package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.WordSearch;

@DisplayName("Running FileReadTest")
class FileReadTest {
	WordSearch search = new WordSearch();

	@Test
	@DisplayName("Testing fileRead method")
	void fileReadTest() throws IOException {
		assertSame("String present in file", search.fileRead(),
				"Should read and check string is present in file or not");
	}

}
