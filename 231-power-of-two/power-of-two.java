class Solution {
    public boolean isPowerOfTwo(int n) {
        // Using Bit Manipulation
         return n > 0 && (n & (n - 1)) == 0;
        
    }
}