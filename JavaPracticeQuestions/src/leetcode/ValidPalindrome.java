package leetcode;


public class ValidPalindrome {
    public boolean  isValidPalindrome(String S) {
        int i =0;
        int j =S.length()-1;
        while(i<j)
        {
            if(S.charAt(i)!=S.charAt(j))            //j is pointing at the end of the string
            return isPalindrome(S,i+1,j)||isPalindrome(S,i,j-1);
            
            
            i++;
            j--;
            
        }

        return true;
    }

    private boolean isPalindrome(String S, int i, int j) {
        while(i<j)
        {
            if(S.charAt(i++)!=S.charAt(j--))            //j is pointing at the end of the string
            return false;
        }
        return true;
    }
    public static void main(String args[]) {
         ValidPalindrome valPal = new ValidPalindrome();
       String input = "abab";//abab//xyxq//qxyx//acba
       Boolean result = valPal.isValidPalindrome(input);
       System.out.println("result "+result);
     
     }
}
