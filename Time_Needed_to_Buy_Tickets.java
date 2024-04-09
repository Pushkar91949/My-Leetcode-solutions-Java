public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int n = tickets.length;
        int timeTaken = 0;

        while (tickets[k] > 0) {
            for (int i = 0; i < n; i++) {
                if (tickets[i] > 0) {
                    tickets[i]--;
                    timeTaken++;
                    if (i == k && tickets[i] == 0) {
                        return timeTaken;
                    }
                }
            }
        }
        return timeTaken;
    }
}
