package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class TwoNumbersSumTest {
    @Test
    public void singleNums() {
        TwoNumbersSum twoNum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<Integer>() {{add(1);}};
        ArrayList<Integer> second = new ArrayList<Integer>() {{add(2);}};
        ArrayList<Integer> result = twoNum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<Integer>() {{add(3);}};
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void carryTen(){
        TwoNumbersSum twoNum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<Integer>() {{add(7);}};
        ArrayList<Integer> second = new ArrayList<Integer>() {{add(9);}};
        ArrayList<Integer> result = twoNum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<Integer>() {{add(1); add(6);}};
        Assertions.assertEquals(expected, result);
    }
    @Test
    public void multipleNumbersNoCarry(){
        TwoNumbersSum twoNum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<Integer>() {{add(2); add(2);}};
        ArrayList<Integer> second = new ArrayList<Integer>() {{add(1); add(3);}};
        ArrayList<Integer> result = twoNum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<Integer>() {{add(3); add(5);}};
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void multipleNumbersCarry(){
        TwoNumbersSum twoNum = new TwoNumbersSum();
        ArrayList<Integer> first = new ArrayList<Integer>() {{add(2); add(6);}};
        ArrayList<Integer> second = new ArrayList<Integer>() {{add(8);}};
        ArrayList<Integer> result = twoNum.addTwoNumbers(first, second);
        ArrayList<Integer> expected = new ArrayList<Integer>() {{add(3); add(4);}};
        Assertions.assertEquals(expected, result);
    }
}
