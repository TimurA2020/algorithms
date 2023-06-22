package binary;

public class AddBinary {
    public String addBinary(String a, String b) {
        int carry = 0;
        StringBuilder res = new StringBuilder();
        int sum;


        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            sum = carry;
            if(i >= 0)
                sum += a.charAt(i) - '0';
            if(j >= 0)
                sum += b.charAt(j) - '0';
            res.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0)
            res.append(carry);
        return res.reverse().toString();
    }

    public String addBinarySimple(String a, String b) {
        long x = Integer.parseInt(a, 2);
        long y = Integer.parseInt(b, 2);

        long sum = x + y;

        return Long.toBinaryString(sum);
    }
}
