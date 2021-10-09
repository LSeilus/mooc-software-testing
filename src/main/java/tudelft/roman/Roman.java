package tudelft.roman;

import java.util.HashMap;
import java.util.Map;

public class Roman {

    private static Map<Character, Integer> numerals;
    static {
        numerals = new HashMap<Character, Integer>();
        numerals.put('I', 1);
        numerals.put('V', 5);
        numerals.put('X', 10);
        numerals.put('L', 50);
        numerals.put('C', 100);
        numerals.put('D', 500);
        numerals.put('M', 1000);
    }

    public int convert(String romanNum){
        int result = 0;
        for (int i = 0; i < romanNum.length(); i++){
            if(i != (romanNum.length() -1)){
                if (romanNum.charAt(i) == 'I' && (romanNum.charAt(i + 1) == 'V' || romanNum.charAt(i + 1) == 'X')) {
                    result --;
                } else if (romanNum.charAt(i) == 'C' && (romanNum.charAt(i + 1) == 'D' || romanNum.charAt(i + 1) == 'M')) {
                    result -= 100;
                } else {
                    result += numerals.get(romanNum.charAt(i));
                }
            }
            else{
                result += numerals.get(romanNum.charAt(i));
            }

        }
        return result;
    }
}
