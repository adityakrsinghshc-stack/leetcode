class Solution {
    public int findMiddleIndex(int[] nums) {
        int middleindex = 0;
        int[] prefix = new int[nums.length];
        prefix[0] = nums[0];
        for(int i = 1 ; i<nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
        int totalsum = prefix[nums.length - 1];
        for(int i = 0; i<nums.length ; i++){
            int leftsum;
            int rightsum;
            if(i==0){
                leftsum = 0;
            }
            else{
                leftsum = prefix[i-1];
            }

            if(i == nums.length - 1){
                rightsum = 0;
            }
            else{
                rightsum = totalsum - prefix[i];
            }
            
            if(leftsum == rightsum){
                middleindex = i;
                return middleindex;
            }
        }
        return -1;
    }
}