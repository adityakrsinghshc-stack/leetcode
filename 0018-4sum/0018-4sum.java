public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        
        // Base case: if array has fewer than 4 elements, it's impossible to form a quadruplet
        if (nums == null || nums.length < 4) {
            return result;
        }
        
        // Step 1: Sort the array to handle duplicates easily and enable two pointers
        Arrays.sort(nums);
        int n = nums.length;
        
        // Step 2: Fix the first element (nums[i])
        for (int i = 0; i < n - 3; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            // Pruning Optimization 1: Smallest possible sum from this point is greater than target
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) {
                break; 
            }
            // Pruning Optimization 2: Largest possible sum from this point is less than target
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue; 
            }
            
            // Step 3: Fix the second element (nums[j])
            for (int j = i + 1; j < n - 2; j++) {
                // Skip duplicate values for the second element
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                
                // Pruning Optimization 3: Smallest possible sum from this point is greater than target
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) {
                    break;
                }
                // Pruning Optimization 4: Largest possible sum from this point is less than target
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }
                
                // Step 4: Two-pointer approach for the remaining two elements
                int left = j + 1;
                int right = n - 1;
                
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    
                    if (sum == target) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        
                        // Skip duplicates for the third element
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for the fourth element
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++; // Sum is too small, move left pointer to increase sum
                    } else {
                        right--; // Sum is too large, move right pointer to decrease sum
                    }
                }
            }
        }
        
        return result;
    }
}
