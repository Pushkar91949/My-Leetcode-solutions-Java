class Solution {
    public int countSeniors(String[] details) {
        int ans = 0;
        for (var x:details) {
            int a = Integer.parseInt(x.substring(11,13));
            if (a > 60) {
                ans++;
            }
        }
        return ans;
    }
} // Question link: https://leetcode.com/problems/number-of-senior-citizens/
