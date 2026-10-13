class Solution {
    public boolean detectCapitalUse(String word) {
        int uppercaseCount = 0;
        int length = word.length();
        for (int i = 0; i < length; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                uppercaseCount++;
            }
        }
        return uppercaseCount == 0 || 
               uppercaseCount == length || 
               (uppercaseCount == 1 && Character.isUpperCase(word.charAt(0)));
    }
}
