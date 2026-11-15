import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        
        int[] rowMins = new int[rows];
        for (int i = 0; i < rows; i++) {
            int minVal = matrix[i][0];
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] < minVal) {
                    minVal = matrix[i][j];
                }
            }
            rowMins[i] = minVal;
        }
        
        
        int[] colMaxs = new int[cols];
        for (int j = 0; j < cols; j++) {
            int maxVal = matrix[0][j];
            for (int i = 1; i < rows; i++) {
                if (matrix[i][j] > maxVal) {
                    maxVal = matrix[i][j];
                }
            }
            colMaxs[j] = maxVal;
        }
        
        
        List<Integer> luckyNumbers = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == rowMins[i] && matrix[i][j] == colMaxs[j]) {
                    luckyNumbers.add(matrix[i][j]);
                }
            }
        }
        
        return luckyNumbers;
    }
}
