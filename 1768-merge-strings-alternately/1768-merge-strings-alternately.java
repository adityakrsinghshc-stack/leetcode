class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int  i = 0;
        int k = 0;
        char[] merged = new char[n+m];
        while(i<n || i<m){
            if(i<n){
                merged[k] = word1.charAt(i);
                k++;
            } 
            if(i<m){
                merged[k] = word2.charAt(i);
                k++;
            }
            i++;
        }
        return new String(merged);
        
        
    }
}