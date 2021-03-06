package SlidingWindow;


/*
 *
 * longest continuous increasing subsequence
 * [1,3,5,4,7]
 *
 * output
 * [135]
 * #3
 *
 *
 * */
public class Subsequnce {


    public int findLengthOfLCIS(int[] nums) {
        int result = 0;
        int anchor = 0;


        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] >= nums[i])
                anchor = i;
            result = Math.max(result, (i - anchor + 1));

        }
        return result;
    }

    public static void main(String[] args) {
        Subsequnce lcis = new Subsequnce();
        int[] input = { 1, 3, 5, 4, 7 };
        int result = lcis.findLengthOfLCIS(input);
        System.out.println(result);
    }

}
