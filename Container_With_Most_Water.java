class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right){
            int currWater = Math.min(height[left],height[right]) * (right - left);

            maxWater = Math.max(maxWater,currWater);

            if(height[left] < height[right]){
                left += 1;
            } else {
                right -= 1;
            }
        }
        return maxWater;
    }
}
