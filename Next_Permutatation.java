class Solution {
    public void nextPermutation(int[] nums) {
        int ind1 = -1;
        int ind2 = -1;

        for (int i = nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind1 = i;
                break;
            }
        }
        if(ind1 == -1){
            reverse(nums,0);
        }

        else{
            for(int i = nums.length-1; i>=ind1; i--){
                if (nums[i] > nums[ind1]){
                    swap(nums, ind1, i);
                    
                    break;
                }
            }

            reverse(nums, ind1 + 1);
        }
    }
    void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void reverse(int[] nums, int start){
        int i = start;
        int j = nums.length - 1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}

// Question link: https://leetcode.com/problems/next-permutation/description/
