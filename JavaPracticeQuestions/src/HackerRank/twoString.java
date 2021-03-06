package HackerRank;

import java.util.HashSet;


/*
 *
 * Str1 = Hello
 * Str2 = World
 *
 * Both the strings have L and O as common Substrings
 *
 *
 *
 * */

public class twoString {
     static String  twoString(String str1,String str2) 
    {
        HashSet<Character> Str1_chars = new HashSet();
        HashSet<Character> Str2_chars = new HashSet();
        
        for(int i =0;i<str1.length();i++)
        {
                Str1_chars.add(str1.charAt(i));
            
         }
        for(int i =0;i<str2.length();i++)
        {
                Str2_chars.add(str2.charAt(i));
            
         }
                                                          
        Str1_chars.retainAll(Str2_chars); 
        
        
        if(!Str1_chars.isEmpty()) return "YES";
        else return "NO";
    }
    public static void main(String args[]) 
    {
       String str1 = "Hello";
       String str2 = "Shishir";  
       
       System.out.println(twoString(str1, str2)); 
    }
}
