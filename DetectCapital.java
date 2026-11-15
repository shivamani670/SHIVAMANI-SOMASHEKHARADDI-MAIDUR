class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        
        
        if (n <= 1) {
            return true;
        }
        
        
        if (Character.isLowerCase(word.charAt(0))) {
            for (int i = 1; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    return false;
                }
            }
        } 
        
        else {
            boolean secondIsUpper = Character.isUpperCase(word.charAt(1));
            for (int i = 2; i < n; i++) {
                if (Character.isUpperCase(word.charAt(i)) != secondIsUpper) {
                    return false;
                }
            }
        }
        
        return true;
    }
