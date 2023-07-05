package array;

public class ZigZag {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder[] sbs = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            sbs[i] = new StringBuilder();
        }

        int index = 0;

        while (index < s.length()) {
            for (int j = 0; j < numRows && index < s.length(); j++) {
                sbs[j].append(s.charAt(index++));
            }

            for (int j = numRows - 2; j > 0 && index < s.length(); j--) {
                sbs[j].append(s.charAt(index++));
            }
        }

        StringBuilder result = sbs[0];

        for (int i = 1; i < numRows; i++) {
            result.append(sbs[i]);
        }

        return result.toString();
    }
}
