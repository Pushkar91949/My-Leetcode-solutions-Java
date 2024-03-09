public class Solution {
    public String triangleType(int[] nums) {
        int x = countDistinct(nums);

        if (nums[0] + nums[1] > nums[2] && nums[2] + nums[1] > nums[0] && nums[0] + nums[2] > nums[1]) {
            if (x == 3) {
                return "scalene";
            } else if (x == 2) {
                return "isosceles";
            }
            return "equilateral";
        }

        return "none";
    }

    private int countDistinct(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                count++;
            }
        }
        return count;
    }
}

// Question link: https://leetcode.com/problems/type-of-triangle/
