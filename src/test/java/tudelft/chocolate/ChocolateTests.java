package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateTests {

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"1, 1, 7, -1","1,1,6,1","1,1,5,0"})
    public void TotalIsBigger(int small, int big, int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }

    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"3,1,5,0","3,1,6,1","3,0,5,-1","2,3,5,0"})
    public void OnlyBig(int small, int big, int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"2,2,12,2","2,2,13,-1","2,1,12,-1","3,3,12,2","3,2,12,2"})
    public void BigAndSmall(int small, int big, int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest(name = "small={0}, big={1}, total={2}, expected={3}")
    @CsvSource({"4,1,4,4","3,1,4,-1","4,1,3,3"})
    public void OnlySmall(int small, int big, int total, int expected){
        ChocolateBags bags = new ChocolateBags();
        int result = bags.calculate(small, big, total);
        Assertions.assertEquals(expected, result);
    }
}
