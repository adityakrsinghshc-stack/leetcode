class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] newarray = new int[2*n];
        for(int i = 0 ; i < n ; i++){
            newarray[i] = nums[i];
            newarray[i+n] = nums[i];
        }
        return newarray;

    }
}