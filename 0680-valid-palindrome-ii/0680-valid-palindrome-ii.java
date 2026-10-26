class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                StringBuffer sb1 = new StringBuffer(s);
                sb1.deleteCharAt(i);
                String str1 = sb1.toString();
                
                StringBuffer sb2 = new StringBuffer(s);
                sb2.deleteCharAt(j);
                String str2 = sb2.toString();
                return sb1.toString().equals(sb1.reverse().toString()) || sb2.toString().equals(sb2.reverse().toString());
            }
            i++;
            j--;

        }
        return true;
    }
}