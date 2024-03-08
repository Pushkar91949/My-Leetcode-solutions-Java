class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> counterNums = new HashMap<>();

        for (int num : nums) {
            counterNums.put(num, counterNums.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int ans = 0;

        for (int val : counterNums.values()) {
            maxFrequency = Math.max(maxFrequency, val);
        }

        for (int val : counterNums.values()) {
            if (val == maxFrequency) {
                ans += val;
            }
        }

        return ans;
    }
}

// Question link: https://leetcode.com/problems/count-elements-with-maximum-frequency/description/
