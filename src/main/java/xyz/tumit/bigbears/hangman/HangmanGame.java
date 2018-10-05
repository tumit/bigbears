package xyz.tumit.bigbears.hangman;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HangmanGame {
    public boolean hangman(final String secretWord, final Character[] letters) {
        Set<Character> set = new HashSet<Character>(Arrays.asList(letters));
        return secretWord.chars()
                .mapToObj(c -> (char)c)
                .allMatch(set::contains);
    }
}
