class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101]; 
        
        for (int num : nums) {
            count[num]++;
        }
        
        int ans = 0;
    
        for (int i = 1; i <= 100; i++) {
            if (count[i] == 1) {
                ans += i;
            }
        }
        
        return ans;
    }
}
