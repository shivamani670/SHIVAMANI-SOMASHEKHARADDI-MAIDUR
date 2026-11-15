import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        
        
        int colIndex = 0;
        if (ruleKey.equals("color")) {
            colIndex = 1;
        } else if (ruleKey.equals("name")) {
            colIndex = 2;
        }
        
        
        for (List<String> item : items) {
            if (item.get(colIndex).equals(ruleValue)) {
                count++;
            }
        }
        
        return count;
    }
}
