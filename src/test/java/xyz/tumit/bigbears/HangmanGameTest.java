package xyz.tumit.bigbears;

import org.junit.jupiter.api.Test;
import xyz.tumit.bigbears.hangman.HangmanGame;

import static org.assertj.core.api.Assertions.assertThat;

public class HangmanGameTest {

    final HangmanGame game = new HangmanGame();
    final String secretWord = "bigbear";

    @Test
    public void hangman_false() {
        String secretWord = "bigbears";
        Character[] letters = {'a','e','i','o','u','c','d','p','r','k','l','j','h'};

        boolean result = game.hangman(secretWord, letters);

        assertThat(result).isFalse();
    }

    @Test
    public void hangman_true() {

        String secretWord = "bigbears";
        Character[] letters = {'b', 'i', 'g', 'b', 'e', 'a', 'r', 's'};

        boolean result = game.hangman(secretWord, letters);

        assertThat(result).isTrue();
    }
}
