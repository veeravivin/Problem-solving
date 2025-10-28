import java.math.BigInteger;
class Prob_no_43 {
    public String multiply(String num1, String num2) {
        BigInteger n = convert(num1);
        BigInteger m = convert(num2);
        BigInteger p = n.multiply(m);
        String ans = p.toString();
        return ans;
    }

    public BigInteger convert(String num) {
        StringBuilder s = new StringBuilder();
        for (char i : num.toCharArray()) {
            int n = (int) i - 48;
            s.append(n);
        }
        return new BigInteger(s.toString());
    }
}