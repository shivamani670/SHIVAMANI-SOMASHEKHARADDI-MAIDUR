import java.util.HashMap;
import java.util.Map;

class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int goodPairs = 0;
        
        for (int num : nums) {
            
            if (countMap.containsKey(num)) {
                goodPairs += countMap.get(num);
            }
            
            
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        return goodPairs;
    }
}
