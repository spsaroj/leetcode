import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] nums = {3,2,4}; 
        int target = 6;
        System.out.println("Hello world: " + twoSum(nums, target)[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
  }