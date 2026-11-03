class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int maxnum = nums[nums.length - 1];
        int moves = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            moves = moves + (maxnum - nums[i]);
        }
        return moves;
    }
}