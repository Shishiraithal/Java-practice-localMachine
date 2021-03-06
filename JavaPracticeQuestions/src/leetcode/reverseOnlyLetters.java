package leetcode;


public class reverseOnlyLetters {
    public String reverseOnlyLetters(String inputStr ) {
        char[] charArr = inputStr.toCharArray();
        int i = 0;                   //points to starting of the array
        int j = inputStr.length() -1;//points to last element
        while (i < j) {
            while (i < j && !Character.isLetter(inputStr.charAt(i))) 
            {
                i++;
            }
            while (j > i && !Character.isLetter(inputStr.charAt(j))) //means j is > 0
            {
                j--;
            }
            char temp = charArr[i];
            charArr[i++] = charArr[j];
            charArr[j--] = temp;
        }
        return new String(charArr);
    }
    
    public static void main(String args[]) {
       reverseOnlyLetters rol = new reverseOnlyLetters();
       String input = "ab-cd";//(dc-ba),(a-bC-dEf-gIj,j-Ih-gfE-dCba)
       String result = rol.reverseOnlyLetters(input);
       System.out.println("result "+result);
     
     }
}
