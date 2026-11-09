class Solution {
    public int pivotIndex(int[] nums) {
        int[] newarray = new int[nums.length];
        newarray[0] = nums[0];
        for(int i = 1; i<nums.length ; i++){
            newarray[i] = newarray[i-1] + nums[i];
        }
        int totalsum = newarray[nums.length - 1];
        for(int i = 0 ; i < nums.length ; i++){
            int leftsum = 0 ;
            int rightsum = 0 ;
            if(i==0){
                leftsum = 0;
            }
            else{
                leftsum = newarray[i-1];
            } 
            rightsum = totalsum - newarray[i];
            if(leftsum == rightsum){
                return i;
            }
        }
        return -1;
    }
}