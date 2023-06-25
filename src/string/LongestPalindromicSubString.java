package string;

public class LongestPalindromicSubString {
    int resultLength;
    int resultStart;
    public String longestPalindrome(String s) {
        int length = s.length();

        if(length < 2){
            return s;
        }

        for(int i = 0; i < length - 1; i++){
            checkPalindrome(s, i, i);
            checkPalindrome(s, i, i + 1);
        }

        return s.substring(resultStart, resultLength + resultStart);

    }

    public void checkPalindrome(String l, int left, int right){

        while (left >= 0 && right < l.length() && l.charAt(left) == l.charAt(right)) {
            left--;
            right++;
        }

        if(resultLength < right - left - 1){
            resultLength = right - left - 1;
            resultStart = left + 1;
        }

    }
}
