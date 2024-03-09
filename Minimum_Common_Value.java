class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        int i1 = 0;
        int i2 = 0;

        int l1 = nums1.length;
        int l2 = nums2.length;

        while (i1 < l1 && i2 < l2){
            if (nums1[i1] == nums2[i2]){
                return nums1[i1];
            }
            else if (nums1[i1] < nums2[i2]){
                i1++;
            } else {
                i2++;
            }
        }
        return -1;
    }
}

// Question link: https://leetcode.com/problems/minimum-common-value/
