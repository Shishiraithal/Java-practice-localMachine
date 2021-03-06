package leetcode;


public class lowercase {
    public String toLowerCase(String input)
    {
        String result = "";
        for(char c :input.toCharArray())
        {
            System.out.println(c +" "+Integer.valueOf(c));
           if(Character.isUpperCase(c)) 
         {
             result = result+(char)(c+32); //A IS 65 a is 97
             
         }
        }
        return result;
    }
    public static void main(String[] args) {
        lowercase lower = new lowercase();
        String input = "abcdwxyz";//"ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String result =lower.toLowerCase(input);
        System.out.println(result);
    }
}
