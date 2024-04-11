class Solution {
    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && k > 0 && stack.peekLast() > num.charAt(i)) {
                stack.removeLast();
                k--;
            }
            stack.addLast(num.charAt(i));
        }

        for (int i = 0; i < k; i++) {
            stack.removeLast();
        }

        StringBuilder res = new StringBuilder();
        while (!stack.isEmpty()) {
            res.append(stack.removeFirst());
        }

        int i = 0;
        while (i < res.length() && res.charAt(i) == '0') {
            i++;
        }

        res.delete(0, i);

        return res.length() == 0 ? "0" : res.toString();
    }
}
 // Question link: https://leetcode.com/problems/remove-k-digits/
