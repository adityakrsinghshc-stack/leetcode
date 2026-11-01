class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int moves = 0;
        int totalsum = 0;
        int min = nums[0];
        for (int num : nums) {
            min = Math.min(min, num);
        }
        for(int i = 0; i< n ; i++){
            totalsum = totalsum + nums[i];
        }
        moves = totalsum - min*n;
        return moves;
    }
}