package basics;

import java.util.Scanner;

// Write your code here. DO NOT use an access modifier in your class declaration.
class Solution {
	public boolean isBalanced(String word)
    {
      if(word != null)
      {
          System.out.println(word);
      }
      else if(true)
      {

      }
      else if(true)
      {
          
      }
      return false;


    }

	public static void main(String[] args) {
		 Solution obj  = new Solution();

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
            
			System.out.println(obj.isBalanced(in.next()));
		}
        
		in.close();
	}
}

