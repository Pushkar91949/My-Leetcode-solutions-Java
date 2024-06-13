class Solution {
    public int minMovesToSeat(int[] seats, int[] students)  {
        
        seats = countsort(seats);
        students = countsort(students);

        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            ans += Math.abs(seats[i] - students[i]);
        }
        return ans;
    }
    public int[] countsort(int[] arr) {
        int[] count = new int[101];
        for (int num : arr) {
            count[num]++;
        }
        int[] ans = new int[arr.length];
        int index = 0;
        for (int i = 0; i < 101; i++) {
            while (count[i]-- > 0) {
                ans[index++] = i;
            }
        }
        return ans;
        }
} // Question link: https://leetcode.com/problems/minimum-number-of-moves-to-seat-everyone/
