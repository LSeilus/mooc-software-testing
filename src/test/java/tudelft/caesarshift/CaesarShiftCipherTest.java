package tudelft.caesarshift;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CaesarShiftCipherTest {
    @ParameterizedTest
    @CsvSource({"@$(^:, 2, invalid", "|>/, 0, invalid"})
    public void nonLetters(String text, int shift, String result){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String msg = cipher.CaesarShiftCipher(text, shift);
        Assertions.assertEquals(result, msg);
    }
    @ParameterizedTest
    @CsvSource({"abc"})
    public void noShift(String text){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String msg = cipher.CaesarShiftCipher(text, 0);
        Assertions.assertEquals(text, msg);
    }

    @ParameterizedTest
    @CsvSource({"xyz, abc, 3", "yz, za, 1"})
    public void wraparound(String text, String result, int shift){
        CaesarShiftCipher cipher = new CaesarShiftCipher();
        String msg = cipher.CaesarShiftCipher(text, shift);
        Assertions.assertEquals(result, msg);
    }

}
