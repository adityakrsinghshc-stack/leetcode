class Solution {
    public boolean isIsomorphic(String s, String t) {
        // Arrays to store the last seen positions of characters (ASCII size 256)
        int[] mapS = new int[256];
        int[] mapT = new int[256];
        
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            
            // If the last seen positions do not match, the strings are not isomorphic
            if (mapS[charS] != mapT[charT]) {
                return false;
            }
            
            // Update the positions. 
            // Use 'i + 1' because the array defaults to 0 (which handles unvisited characters).
            mapS[charS] = i + 1;
            mapT[charT] = i + 1;
        }
        
        return true;
    }
}
