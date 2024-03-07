class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int len1 = flowerbed.length;
        int i = 0;

        while (i<len1){
            if(flowerbed[i] == 0){
                if ((i == 0 || flowerbed[i-1] == 0) && (i==len1-1 || flowerbed[i+1] == 0)){
                    count++;
                    i+=2;
                } else {
                    i += 1;
                }
            } else {
                i += 2;
            }
        }
        return count >= n;
    }
}
// Question link: https://leetcode.com/problems/can-place-flowers/
