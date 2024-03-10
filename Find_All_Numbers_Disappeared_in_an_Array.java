class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int val : nums) {
            numSet.add(val);
        }
        ArrayList<Integer> missingNumbersList = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!numSet.contains(i)) {
                missingNumbersList.add(i);
            }
        }
        return missingNumbersList;
    }
}
// Question Link: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
