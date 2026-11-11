class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length -1 ; 
        int[] square = new int[nums.length];
        for(int k = nums.length -1 ; k>=0 ; k--){
            if(Math.abs(nums[j]) > Math.abs(nums[i])){
                square[k] = nums[j] * nums[j];
                j--;
            }
            else{
                square[k] = nums[i] * nums[i];
                i++;
            }
        }
        return square ;
    }
}