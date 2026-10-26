class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0 ;
        int j = nums.length - 1;
        int[] square = new int[nums.length];
        for(int k = nums.length - 1 ; k >= 0 ; k--){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                square[k] = nums[i] * nums[i];
                i++;
            }
            else{
                square[k] = nums[j] * nums[j];
                j--;
            }
        }
        return square;
    }
}