class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int x2 = x;
        int s = 0;
        while (x > 0) {
            s += x % 10;
            x /= 10;
        }
        if (x2 % s == 0) {
            return s;
        }
        return -1;
    }
} // Question link: https://leetcode.com/problems/harshad-number/
