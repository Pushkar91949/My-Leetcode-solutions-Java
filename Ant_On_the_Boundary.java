class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int s = 0;
        int count = 0;
        for(int num: nums){
            s += num;
            if (s == 0){
                count += 1;
            }
        }
        return count;
    }
} // Question link: https://leetcode.com/problems/ant-on-the-boundary/
