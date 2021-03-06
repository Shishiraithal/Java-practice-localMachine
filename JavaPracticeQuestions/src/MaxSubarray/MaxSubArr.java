package MaxSubarray;

import java.util.Arrays;

public class MaxSubArr {


    public int[] maxSum(int arr[], int sum) {
        Arrays.sort(arr);

        int tillSum = sum;
        int currSum = 0;
        Boolean found = false;
        int[] resultArr = new int[arr.length];
        int[] resultArr1 = new int[0];
        
        if(arr.length==0)
        {
            return resultArr1;
        }
        
        
        for (int i = 0; i < arr.length; i++) {
            currSum = currSum + arr[i];
            resultArr[i] = arr[i];
            if (currSum == tillSum) {
                found = true;
                break;
            }
        }

        if (found) {
            return resultArr;
        } else {
            return resultArr1;
        }

    }

    public static void main(String[] args) {
        MaxSubArr maxSubArr = new MaxSubArr();

        int arr[] = { 5, 6, 1, 2, 5, 3 };
        int sum = 11;

        int[] resultArr = maxSubArr.maxSum(arr, sum);
        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }

}
