class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        
        for (String sentence : sentences) {
            
            int wordCount = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ') {
                    wordCount++;
                }
            }
            
           
            maxWords = Math.max(maxWords, wordCount);
        }
        
        return maxWords;
    }
}
