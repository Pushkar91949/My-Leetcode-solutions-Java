class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int msum = 0;
        for (int roll : rolls) {
            msum += roll;
        }
        int m = rolls.length;
        int nsum = (mean * (n + m)) - msum;

        if (nsum > n * 6 || nsum < n) {
            return new int[0];
        }

        int nmean = nsum / n;
        int nmod = nsum % n;
        int[] ans = new int[n];
        Arrays.fill(ans, nmean);

        for (int i = 0; i < nmod; i++) {
            ans[i] += 1;
        }

        return ans;
    }
}
// Question link: https://leetcode.com/problems/find-missing-observations/
