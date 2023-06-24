package string;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for(int right = 0, left = 0; right < s.length(); right++){
            int firstAppearanceInSubstring = s.indexOf(s.charAt(right), left);

            if(firstAppearanceInSubstring != right){
                left = firstAppearanceInSubstring + 1;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}
