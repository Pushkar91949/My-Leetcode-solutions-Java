class Solution {
    public int findSpecialInteger(int[] arr) {
        int n = arr.length, step = n/4;

        for (int i = 0; i < n - step; i++){
            if (arr[i] == arr[i + step]){
                return arr[i];
            }
        }
        return -1;
    }
}
 // Question link: https://leetcode.com/problems/element-appearing-more-than-25-in-sorted-array/
