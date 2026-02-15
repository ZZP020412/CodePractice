import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class Solution {
    public int[] twoSumBrutal(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
        
    }
    //public int[] twoSumHash(int[] nums, int target) {
    //    
    //}
    public static void main(String[] args) {
    Solution solution = new Solution();

        // Test Case
        int[] nums = {2, 7, 11, 15}; 
        int target = 9;

        // Invoke a member function
        int[] result = solution.twoSumBrutal(nums, target);

        // print the result
        System.out.println( Arrays.toString(result));
   
    }
}


