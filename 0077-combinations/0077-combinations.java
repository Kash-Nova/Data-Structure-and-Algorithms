class Solution {
    List<List<Integer>> ans =new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        
        backtrack(n, k, 1, new ArrayList<>());
    return ans;
  }

  public void  backtrack(int n, int k, int s, List<Integer> path) {
    if (path.size() == k) {
      ans.add(new ArrayList<>(path));
      return;
    }
    for (int i=s; i<=n; i++){
        path.add(i); 
        backtrack(n,k,i+1,path);
        path.remove(path.size()-1);
    }
  }
}

