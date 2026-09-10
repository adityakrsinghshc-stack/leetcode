class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
     int sum =0 ; 
     int count = 0 ;
     for (int i = 0 ; i<k; i++){
        sum = sum + arr[i];
        }
        double avg = (double) sum / k;
        if (avg>=threshold){
            count++;
        }
     int newsum = sum;
     for (int i = k ; i<arr.length; i++){
        sum = sum - arr[i-k] + arr[i];
        double newavg = (double) sum / k;
        if (newavg>=threshold){
            count++;
        }
     }
     return count;
    }
}