class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxLength = 0;
        int[] lastSeen = new int[128]; 
        for (int left = 0, right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            left = Math.max(left, lastSeen[currentChar]);
            maxLength = Math.max(maxLength, right - left + 1);
            lastSeen[currentChar] = right + 1;
        }
        return maxLength;
    }
}
