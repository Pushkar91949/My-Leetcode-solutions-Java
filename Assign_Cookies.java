class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int bacche = 0;
        int i = 0, j = 0;
        while (i < g.length && j < s.length){
            if (s[j] >= g[i]){
                bacche ++;
                i++;
            }
            j++;
        }
        return bacche;
    }
} // Question link: https://leetcode.com/problems/assign-cookies/
