
package Stacks_QueueAndHashMap.HashMap_and_Hash_Functions.basic_HashMap;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public static int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) numSet.add(num);

        int longestStreak = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) { // Starting a new sequence
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Length of Longest Consecutive Sequence: " + longestConsecutive(nums));
    }
}
