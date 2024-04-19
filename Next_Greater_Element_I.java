class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if (nums2.length == 0) {
            return null;
        }
        
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                int topElement = stack.pop();
                nextGreaterMap.put(topElement, num);
            }
            stack.push(num);
        }
        
        while (!stack.isEmpty()) {
            int topElement = stack.pop();
            nextGreaterMap.put(topElement, -1);
        }
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
}
// Question link: https://leetcode.com/problems/next-greater-element-i/
