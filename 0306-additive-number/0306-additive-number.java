import java.math.BigInteger;

class Solution {
    public boolean isAdditiveNumber(String num) {
        return find(num, 1, 2);
    }

    private boolean find(String num, int i, int j) {
        int n = num.length();

        if (i >= n || i > n / 2) {
            return false;
        }

        if (j >= n) {
            return find(num, i + 1, i + 2);
        }

        String a = num.substring(0, i);
        String b = num.substring(i, j);

        if ((a.length() > 1 && a.charAt(0) == '0') ||
            (b.length() > 1 && b.charAt(0) == '0')) {
            return find(num, i, j + 1);
        }

        if (solve(num, j, a, b)) {
            return true;
        }

        return find(num, i, j + 1);
    }

    private boolean solve(String num, int index, String a, String b) {
        if (index == num.length()) {
            return true;
        }

        String sum = new BigInteger(a)
                .add(new BigInteger(b)).toString();

        if (!num.startsWith(sum, index)) {
            return false;
        }

        return solve(num, index + sum.length(), b, sum);
    }
}