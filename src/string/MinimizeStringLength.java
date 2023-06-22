package string;

import java.util.Arrays;

public class MinimizeStringLength {
    public static int minimizedStringLength(String s) {
        char c = '1';
        int count = 0;

        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        for (int i = 0; i < chars.length; i++) {
            if (c == chars[i]) {
                count++;
            }
            c = chars[i];
        }
        return chars.length - count;
    }
}
