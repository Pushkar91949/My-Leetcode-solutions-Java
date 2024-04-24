public class Solution {
    public int tribonacci(int n) {
        if (n > 2) {
            int[] tribo = new int[n + 1];
            tribo[0] = 0;
            tribo[1] = 1;
            tribo[2] = 1;
            for (int i = 3; i <= n; i++) {
                tribo[i] = tribo[i - 3] + tribo[i - 2] + tribo[i - 1];
            }
            return tribo[n];
        } else if (n == 2) {
            return 1;
        } else {
            return n;
        }
    }   
} // Question link: https://leetcode.com/problems/n-th-tribonacci-number/
