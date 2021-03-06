package AllDuplicatesInArray;

import java.util.ArrayList;
import java.util.List;


/*
 * Input  [4,3,2,7,8,2,3,1]
 * Output [2,3]
 * //atleast twice
 *  1<=a[i]<=n ,where n = size of array
 *  make the array element -1the element as neg .
 * */
public class AllDuplicatesInArray {

    public List<Integer> findDuplicates(int[] nums){
     List<Integer> output_arr= new ArrayList();

    for(int i=0;i<nums.length;i++) {
       int index = Math.abs(nums[i])-1;
       if(nums[index]<0)
       {
        output_arr.add(index+1);
        }
       nums[index]= -nums[index];
   }
       return output_arr;
       }
    
    
    
    public static  void main(String args[])
    {
            AllDuplicatesInArray obj = new AllDuplicatesInArray();
            int[] nums =  {4,3,2,7,8,2,3,1};
            List<Integer> Result = obj.findDuplicates(nums);
            for(int ele:Result){
            System.out.println(ele);
        }
        }
    }

