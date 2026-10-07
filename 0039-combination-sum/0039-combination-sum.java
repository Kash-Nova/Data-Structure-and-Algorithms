class Solution {
    List<List<Integer>> Ucombination = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        answer(candidates, target, new ArrayList<>(), target, 0);

        return Ucombination;
    }

    public void answer(int[] candidates, int target,
                       List<Integer> path, int left, int start) {

        if (left == 0) {
            Ucombination.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < candidates.length; i++) {

            if (candidates[i] > left) {
                break;
            }

            path.add(candidates[i]);

            answer(candidates, target, path,
                   left - candidates[i], i);

            path.remove(path.size() - 1);
        }
    }
}