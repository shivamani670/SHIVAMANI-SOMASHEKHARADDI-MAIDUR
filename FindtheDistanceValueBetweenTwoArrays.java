class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distanceValue = 0;
        
        for (int x : arr1) {
            boolean isFar = true;
            
            for (int y : arr2) {
                
                if (Math.abs(x - y) <= d) {
                    isFar = false;
                    break; 
                }
            }
            
            
            if (isFar) {
                distanceValue++;
            }
        }
        
        return distanceValue;
    }
}
