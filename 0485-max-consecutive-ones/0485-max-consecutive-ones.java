class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxconsecutiveones = 0;
        int numberofones = 0;
        for(int num : nums){
            if(num == 1){
                numberofones++;
            }
            else{
                numberofones = 0 ;
            }
             maxconsecutiveones = Math.max(numberofones , maxconsecutiveones);
        }
        return maxconsecutiveones;
    }
}