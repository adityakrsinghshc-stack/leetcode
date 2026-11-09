class Solution {
    public int findNumbers(int[] nums) {
       int evendigitnumber = 0 ;
       for(int num : nums){
        int numberofdigits = 0 ;
        while(num > 0){
            int digit = num % 10 ;
            numberofdigits++;
            num = num/10;
        }
        if(numberofdigits % 2 == 0){
            evendigitnumber++;
        }
       }
       return evendigitnumber;
    }
}