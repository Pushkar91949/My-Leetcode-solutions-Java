class Solution {
    public void reverseString(char[] s) {
        int l=0;
        int r = s.length - 1;
        while(l<r){
            char tem=s[l];
            s[l++]=s[r];
            s[r--]=tem;

        }
    }
} // Question link: https://leetcode.com/problems/reverse-string/
