package ByteByByte;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findAllDuplicates {
    public List<Integer> findDuplicates(int[] arr) {
        Set<Integer> resultSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int index = Math.abs(arr[i]) - 1;
            if (arr[index] < 0) {
                resultSet.add(Math.abs(arr[i]));
            } else {
                arr[index] = -arr[index];
            }

        }
        for (int i = 0; i < arr.length; i++) {

            arr[i] = Math.abs(arr[i]);
        }

        return new ArrayList(resultSet);
    }
    public static void main (String args[])
    {
        int[] arr = new int[]{1,2,1,3,4,4,2,3,5,3}; 

     System.out.println("given int arr is");
         for(int ele:arr)
         {
           System.out.print(ele);
             
         }
         
         System.out.println("\n");
         findAllDuplicates fad = new findAllDuplicates();
         List<Integer> ResArr = new ArrayList();
        
         ResArr = fad.findDuplicates(arr);
         for(int ele:ResArr)
         {
           System.out.println(ele);
             
         }
        
     }
}
