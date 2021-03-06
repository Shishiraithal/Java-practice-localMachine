package leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*
 *given a array of integers return the unique triplets which sum to zero
 *
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> output_arr = new LinkedList();
        for (int i = 0; i < nums.length - 2; i++) {//because we are starting from 1st element and searching its compliment
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int low = i + 1;
                int high = nums.length - 1; //last element
                int sum =
                    0 -nums[i]; //sum is zero but when you subtract the first element then it will give us the other number
                while (low < high) //from second element to to the last
                {
                    if (nums[low] + nums[high] == sum) //check whether the sum is 1st and last ele
                    {
                        output_arr.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while (low < high && nums[low] == nums[low + 1])
                            low++;
                        while (low < high && nums[high] == nums[high - 1])
                            high--;
                        low++;
                        high--;
                    } else if (nums[low] + nums[high] > sum) {
                        high--;

                    } else {
                        low++;

                    }
                }
            }
        }
        return output_arr;
    }

    public static void main(String args[]) {
        ThreeSum threesum = new ThreeSum();
        int[] input = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> output_arr = new LinkedList();
        output_arr = threesum.threeSum(input);
        for (List ele : output_arr) {
            System.out.println(ele.toString());
        }
    }
}
