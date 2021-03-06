package FirstAndLastPosOfEl;


/*
 * first and last position of element in Sorted array
 *run time complexity O(log n)
 *if target is not found return [-1,-1]
 *
 * nums[5,7,7,8,8,10],target = 8
 * output [3,4]
 *
 * */
public class FirstAndLastPosOfEl {

    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = findStartingIndex(nums, target);
        result[1] = findEndingIndex(nums, target);

        return result;

    }

    public int findStartingIndex(int[] nums, int target) {
        int index = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] == target) {
                index = midpoint;
            }
            if (nums[midpoint] >= target) {
                end = midpoint - 1;
            } else {
                start = midpoint + 1;
            }
        }

        return index;
    }

    public int findEndingIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int index = -1;
        while (start <= end) {
            int midpoint = start + (end - start) / 2;
            if (nums[midpoint] == target) {
                index = midpoint;
            }
            if (nums[midpoint] <= target) {
                end = midpoint + 1;
            } else {
                start = midpoint - 1;
            }
        }


        return index;
    }

    public static void main(String[] args) {
        FirstAndLastPosOfEl firstAndLastPosOfEl = new FirstAndLastPosOfEl();
    }
}
