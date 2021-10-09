package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    @ParameterizedTest
    @CsvSource({ "g, false", "d, true"})
    public void singleCharacter(String str, boolean expected){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"gg, true","gc, false","ch, true"})
    public void twoCharacters(String str, boolean expected){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"gghd, true", "ghgj, false", "hgge, true", "kxgg, true", "khgt, false", "eprq, true"})
    public void moreCharacters(String str, boolean expected){
        GHappy happy = new GHappy();
        boolean result = happy.gHappy(str);
        Assertions.assertEquals(expected, result);
    }
}
