class Solution {
    public int calPoints(String[] operations) {
        List<Integer> record = new ArrayList<>();
        
        for (String op : operations) {
            switch (op) {
                case "+":
                    int lastTwoSum = record.get(record.size() - 1) + record.get(record.size() - 2);
                    record.add(lastTwoSum);
                    break;
                case "C":
                    record.remove(record.size() - 1);
                    break;
                case "D":
                    int lastValue = record.get(record.size() - 1);
                    record.add(lastValue * 2);
                    break;
                default:
                    record.add(Integer.parseInt(op));
                    break;
            }
        }
        
        int total = 0;
        for (int score : record) {
            total += score;
        }
        return total;
    }
}
// Question link: https://leetcode.com/problems/baseball-game/
