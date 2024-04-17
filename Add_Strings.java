public class Solution {
    public String addStrings(String num1, String num2) {
        int pointer1 = num1.length() - 1;
        int pointer2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        
        while (pointer1 >= 0 || pointer2 >= 0 || carry != 0) {
            int digit1 = pointer1 >= 0 ? Character.getNumericValue(num1.charAt(pointer1)) : 0;
            int digit2 = pointer2 >= 0 ? Character.getNumericValue(num2.charAt(pointer2)) : 0;
            int sumDigits = digit1 + digit2 + carry;
            carry = sumDigits / 10;
            result.append(sumDigits % 10);
            
            pointer1--;
            pointer2--;
        }
        
        return result.reverse().toString();
    }
}
 // Question link: https://leetcode.com/problems/add-strings/
