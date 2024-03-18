class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int new_arr[] = new int[101];
        
        for(int i = 0;i<nums.length;i++){
            new_arr[nums[i]]++;
            if(new_arr[nums[i]]>2)
            return false;
        } 
        return true;
    }
} // Question link: https://leetcode.com/problems/split-the-array/
