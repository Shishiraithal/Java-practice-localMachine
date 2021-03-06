package DiagonalDiff;


/**
 * diff of diagonals in a matrix
 *
 *[
 * 1  5  8
 * 3  4  2
 * 7  1  3
 * ]
 *
 *[8+4+7]-[1+4+3]
 * =15 -8
 * 7//
 *
 * */

public class DiagonalDiff 
{
    
    public static void main (String args[])
    {
        
        int[][] arr = new int[3][3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
        {
         arr[i][j]= i+2;
            System.out.print( arr[i][j]); 
            
        }
        
    }
        System.out.println( "\n-----"); 
    }
       int ans = diagonalDiff(arr); 
        System.out.println(ans);
        
    }
 static int diagonalDiff(int[][] arr)
    {
        int left_to_right =0;
        int right_to_left =0;
        
        int rows = arr.length;
        int cols = arr[0].length;
        
        int i = 0,j=0,k=0,l=arr.length-1;
        
        
      while(i<rows && j< cols && l>=0) //arr length is positive
      {
          
           left_to_right = left_to_right+arr[i][j];
           right_to_left = right_to_left+arr[k][l];
          
          i++;
          j++;
          k++;
          l--;
       }
      return Math.abs(left_to_right - right_to_left);
      
    }
}
