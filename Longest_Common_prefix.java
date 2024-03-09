class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        StringBuilder s = new StringBuilder();

        String initial = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(initial.length(), last.length()); i++) {
            
            if (initial.charAt(i) != last.charAt(i)) {
                return s.toString();
            }
            s.append(initial.charAt(i));
        }

        return s.toString();
    }

}

// Question link: https://leetcode.com/problems/longest-common-prefix/
