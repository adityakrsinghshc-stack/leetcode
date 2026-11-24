class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0 ; 
        int countofzeros = 0 ;
        int maxlength = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                countofzeros++;
            }
            while(countofzeros > k){
                //invalid subarray 
                if(nums[left] == 0){
                    countofzeros--;
                }
                left++;
            }
            int length = i - left + 1 ;
            maxlength = Math.max(length , maxlength);
        }
        return maxlength;

    }
}