class Solution {
    public int findLHS(int[] nums) {
        int res = 0;
        HashMap<Integer, Integer> countnum = new HashMap<>();
        
        for (int num : nums) {
            countnum.put(num, countnum.getOrDefault(num, 0) + 1);
        }
        
        for (int num : countnum.keySet()) {
            if (countnum.containsKey(num + 1)) {
                res = Math.max(countnum.get(num) + countnum.get(num + 1), res);
            }
        }
        
        return res;
    }
} // Question link: https://leetcode.com/problems/longest-harmonious-subsequence/description/
