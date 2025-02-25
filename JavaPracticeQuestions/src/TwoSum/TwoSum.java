package TwoSum;

import java.util.HashMap;
import java.util.Map;


public class TwoSum {
    private static int[] result;

    public TwoSum() {
        super();
    }
  //
    /*  
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
    
    */
  //
    ///one more approach//
    /*
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    */
   //one more approach//
   public static int[] twoSum(int[] nums, int target) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (map.containsKey(complement)) {
               return new int[] { map.get(complement), i };
           }
           map.put(nums[i], i);
       }
       throw new IllegalArgumentException("No two sum solution");
   }
    public static void main (String args[]){
        int[] nums = {2, 7, 11, 15},result ;
        int target =18;
        
        result= twoSum(nums,target);
       
        for(int elm:result)
        {
         System.out.println(elm);
        }
        
    }
}
