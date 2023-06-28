package string;

import java.util.HashMap;
import java.util.Map;

public class IntToRomanViceVersa {
    public String intToRoman(int num) {
        String thousands[] = {"", "M", "MM", "MMM"};
        String hundreds[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String tens[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String digits[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return thousands[num / 1000] + hundreds[(num % 1000) / 100] + tens[(num % 100) / 10] + digits[num % 10];
    }

    public int romanToInt(String s) {
        //insert into hashmap
        //check if current value is smaller than the previous one

        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5 );
        map.put('X', 10 );
        map.put('L', 50 );
        map.put('C', 100 );
        map.put('D', 500 );
        map.put('M', 1000 );
        for (int i = 0; i < s.length(); i++){
            if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))){
                result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            }else{
                result += map.get(s.charAt(i));
            }

        }

        return result;
    }
}
