class Solution {
    public long continuousSubarrays(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int l = 0, r = 0;
        long ans = 0;

        while (r < nums.length) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);

            while (Collections.max(freq.keySet()) - Collections.min(freq.keySet()) > 2) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }

            ans += r - l + 1;
            r++;
        }

        return ans;
    }
}
// Question link: https://leetcode.com/problems/continuous-subarrays/description/
