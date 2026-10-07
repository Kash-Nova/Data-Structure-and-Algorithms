class Solution {

    public List<Integer> lexicalOrder(int n) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            dfs(i, n, result);
        }

        return result;
    }

    public void dfs(int num, int n, List<Integer> result) {

        if (num > n) {
            return;
        }

        result.add(num);

        for (int i = 0; i <= 9; i++) {

            int next = num * 10 + i;

            if (next <= n) {
                dfs(next, n, result);
            }
        }
    }
}