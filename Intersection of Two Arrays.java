public class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for (int num : nums1) {
            numFrequencyMap.put(num, numFrequencyMap.getOrDefault(num, 0) + 1);
        }
        
        List<Integer> commonNumList = new ArrayList<>();
        for (int num : nums2) {
            if (numFrequencyMap.containsKey(num)) {
                commonNumList.add(num);
                numFrequencyMap.remove(num);
            }
        }
        
        int[] resultArray = new int[commonNumList.size()];
        for (int i = 0; i < commonNumList.size(); i++) {
            resultArray[i] = commonNumList.get(i);
        }
        return resultArray;
    }
}

// Question link: https://leetcode.com/problems/intersection-of-two-arrays/
