package string;

import java.util.Arrays;

public class Anagram {
    public boolean isAnagram(String s, String t) {
        char[] charsS = s.toCharArray();
        char[] charsT = t.toCharArray();
        Arrays.sort(charsS);
        Arrays.sort(charsT);

        return new String(charsS).equals(new String(charsT));
    }
}
