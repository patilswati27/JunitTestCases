package Javaprograms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import JavaPrograms.GuessGame;

@DisplayName("Running GuessGameTest")
class GuessGameTest {
	GuessGame game = new GuessGame();

	@Test
	@DisplayName("Running GuessGameTest")
	void testSearch() {
		assertEquals(12, game.search(0, 22), "Should return exact number");

	}
}
