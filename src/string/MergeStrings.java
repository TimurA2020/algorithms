package string;

public class MergeStrings {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        boolean inRange = true;

        int minLength = Math.min(word1.length(), word2.length());

        for (int i = 0; i < minLength; i++) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(i));
        }

        if (word1.length() == word2.length()) {
            return result.toString();
        }

        String longerWord;
        if (word1.length() > word2.length()) {
            longerWord = word1;
        } else {
            longerWord = word2;
        }

        for (int i = minLength; i < longerWord.length(); i++) {
            result.append(longerWord.charAt(i));
        }

        return result.toString();
    }
}
