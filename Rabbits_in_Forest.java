public class Solution {
    public int numRabbits(int[] answers) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int totalRabbits = 0;
        
        for (int answer : answers) {
            frequency.put(answer, frequency.getOrDefault(answer, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            int answer = entry.getKey();
            int count = entry.getValue();
            int groupSize = answer + 1;
            int groupsNeeded = (int) Math.ceil((double) count / groupSize);
            totalRabbits += groupsNeeded * groupSize;
        }
        
        return totalRabbits;
    }
} // Question link: https://leetcode.com/problems/rabbits-in-forest/
