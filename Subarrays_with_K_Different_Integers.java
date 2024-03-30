class Solution {
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        int c = 0;
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        while (r < n) {
            freq.put(nums[r], freq.getOrDefault(nums[r], 0) + 1);
            
            while (freq.size() > k) {
                freq.put(nums[l], freq.get(nums[l]) - 1);
                if (freq.get(nums[l]) == 0) {
                    freq.remove(nums[l]);
                }
                l++;
            }
            
            c += r - l + 1;
            r++;
        }
        
        return c;
    }
    
    public int subarraysWithKDistinct(int[] nums, int k) {
        return countSubarrays(nums, k) - countSubarrays(nums, k - 1);
    }
}
 // Question link: https://leetcode.com/problems/subarrays-with-k-different-integers/
