import java.util.HashSet;
import java.util.Set;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Handle empty array edge case
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Step 1: Populate the HashSet with all elements
        // This allows O(1) average time complexity for lookups
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int longestStreak = 0;

        // Step 2: Iterate through the set (or original array)
        for (int num : numSet) {
            // Check if 'num' is the start of a sequence
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                // Step 3: Count the consecutive numbers forward
                while (numSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }

                // Step 4: Keep track of the maximum sequence found
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}

