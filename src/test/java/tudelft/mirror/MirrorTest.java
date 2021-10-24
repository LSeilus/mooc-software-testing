package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MirrorTest {

    @Test
    public void singleChar(){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds("a");
        Assertions.assertEquals("a", result);
    }

    @ParameterizedTest
    @CsvSource({"baab, baab", "aba, aba"})
    public void wholeString(String initial, String expected){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(initial);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest
    @CsvSource({"narcan, na", "podaABCadop, poda"})
    public void partial(String initial, String expected){
        Mirror mirror = new Mirror();
        String result = mirror.mirrorEnds(initial);
        Assertions.assertEquals(expected, result);
    }
}
