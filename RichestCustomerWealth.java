class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealthSoFar = 0;
        
        
        for (int i = 0; i < accounts.length; i++) {
            int currentCustomerWealth = 0;
            
            
            for (int j = 0; j < accounts[i].length; j++) {
                currentCustomerWealth += accounts[i][j];
            }
            
            
            maxWealthSoFar = Math.max(maxWealthSoFar, currentCustomerWealth);
        }
        
        return maxWealthSoFar;
    }
}
