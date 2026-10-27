class Solution {
    public int countAsterisks(String s) {
        int count = 0;
        int asstrics = 0;
        for(int i =0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch =='|'){
                count++;
            }
            else if (ch == '*' && count % 2 ==0){
                asstrics ++;
            }
        }
        
        return asstrics;
         
    }
}