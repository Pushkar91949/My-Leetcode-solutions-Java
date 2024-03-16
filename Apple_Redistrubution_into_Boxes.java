public class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int count = 0;
        int apples = 0;
        for (int a : apple) {
            apples += a;
        }
        int i = capacity.length - 1;
        if (apples > 0) {
            while (i >= 0 && apples > 0) {
                apples -= capacity[i];
                count++;
                i--;
            }
        }
        return count;
    }
} // Question link:  https://leetcode.com/problems/apple-redistribution-into-boxes/
