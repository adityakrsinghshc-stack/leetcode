class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) {
            return true;
        }

        int sPointer = 0;
        int tPointer = 0;

        // dono string ittrate krna h end tk
        while (sPointer < s.length() && tPointer < t.length()) {
            // If  matched, move the pointer for s
            if (s.charAt(sPointer) == t.charAt(tPointer)) {
                sPointer++;
            }
            // Always move the pointer for t
            tPointer++;
        }

        // If sPointer reached the end of s, all characters were found in order
        return sPointer == s.length();
    }
}
