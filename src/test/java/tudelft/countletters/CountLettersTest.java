package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|rebar");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @ParameterizedTest
    @CsvSource({"hash|rebar, 1", "hash|cups, 1"})
    public void onlyLastWordMatches(String text, int result){
        int words = new CountLetters().count(text);
        Assertions.assertEquals(result, words);
    }


}