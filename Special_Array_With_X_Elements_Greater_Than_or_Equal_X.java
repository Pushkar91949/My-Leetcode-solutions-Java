public class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int x = 0; x <= n; x++) {
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + (r-l) / 2;
                if (nums[mid] >= x) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            if (n - l == x) {
                return x;
            }
        }
        
        return -1;
    }
   
}
