package Problem13_RomantoInteger;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    int total = 0;

    public int romanToInt(String s) {
        Map<Character,Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        s = s.replaceAll("IV", "IIII");
        s = s.replaceAll("IX", "VIIII");
        s = s.replaceAll("XL", "XXXX");
        s = s.replaceAll("XC", "LXXXX");
        s = s.replaceAll("CD", "CCCC");
        s = s.replaceAll("CM", "DCCCC");

        for (int i = 0; i < s.length(); i++) {
            total += romanValues.get(s.charAt(i));
        }
        return total;
    }
}
