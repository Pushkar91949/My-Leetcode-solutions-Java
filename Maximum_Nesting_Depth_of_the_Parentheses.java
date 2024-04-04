class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxCount = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
                maxCount = Math.max(maxCount, count);
            } else if (c == ')') {
                count--;
            }
        }
        return maxCount;
    }
} // Question link: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
