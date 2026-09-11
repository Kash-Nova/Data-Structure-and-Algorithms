class Solution {
    public int compress(char[] chars) {
        int present = 0;
        int i = 0;

        while (i < chars.length) {

            char current = chars[i];
            int count = 0;

            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            chars[present++] = current;
             if (count > 1) {
                String countStr = Integer.toString(count);

                for (char c : countStr.toCharArray()) {
                    chars[present++] = c;
                }
            }
        }

        return present;
    }
}
