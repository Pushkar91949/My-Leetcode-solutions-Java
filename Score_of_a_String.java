public class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            ans += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return ans;
    }
} 

/*
Question link: https://leetcode.com/problems/score-of-a-string/

This code calculates the score of a string s 
by iterating through its characters and computing the absolute difference between the
ASCII values of adjacent characters. This difference is accumulated into a variable ans, 
which is then returned as the final score.

*/
