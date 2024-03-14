class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        HashSet<Integer> setnum = new HashSet<>();
        for(int num:nums){
            setnum.add(num);
        }
        for(int num:setnum){
            if(!setnum.contains(num-1)){
                int currlen = 0;
                while (setnum.contains(num+currlen)){
                    currlen++;
                }
                ans = Math.max(ans,currlen);

            }
        }
        return ans;
    }
} // Question link: https://leetcode.com/problems/longest-consecutive-sequence/
