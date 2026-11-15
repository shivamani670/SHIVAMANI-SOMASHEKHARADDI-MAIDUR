class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            // n & (n - 1) flips the least significant set bit to 0
            n &= (n - 1);
            count++;
        }
        return count;
    }
}
