class Solution {
    List<List<Integer>> result = new ArrayList<>();
    Map<Integer, Integer> counter = new HashMap<>();
    int n;
    private void backtrack(List<Integer> temp) {
        if (temp.size() == n) {
            result.add(new ArrayList<>(temp));
            return;
        }
        for (int num : counter.keySet()) {
            if (counter.get(num) >= 1) {
                counter.put(num, counter.get(num) - 1);
                temp.add(num);

                backtrack(temp);

                temp.remove(temp.size() - 1);
                counter.put(num, counter.get(num) + 1);
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }
        n = nums.length;
        backtrack(new ArrayList<>());
        return result;
    }
}