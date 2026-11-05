class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        // If the loop finishes, it means all digits were 9 (e.g., 999 -> 000)
        // We need an extra space at the front for the carry-over 1 (e.g., 1000)
        int[] result = new int[n + 1];
        result[0] = 1; 
        // All other indices default to 0 in Java, which is exactly what we need
        
        return result;
    }
}
