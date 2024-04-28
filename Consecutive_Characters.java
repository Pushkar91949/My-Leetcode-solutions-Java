class Solution {
    public int maxPower(String s) {
        int prev = s.charAt(0);
        int count = 1;
        int maxcount = 1;

        for (int i = 1; i < s.length(); i++){
            if (s.charAt(i) == prev){
                count++;
            }
            else{
                prev = s.charAt(i);
                count = 1;
            }
            maxcount = Math.max(maxcount,count);
        }
        return maxcount;
    }
} // Question link: https://leetcode.com/problems/consecutive-characters/
