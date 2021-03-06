package findAnagrams;

import java.util.ArrayList;
import java.util.List;

public class findAnagrams {
    public findAnagrams() {
        super();
    }

    public static List<Integer> findAnagrams(String txt, String pat) {
        List<Integer> result = new ArrayList();
        if (txt.length() == 0 || txt == null) {
            return result;
        }
        int[] char_count = new int[26];

        for (char c : pat.toCharArray()) {
            char_count[c - 'a']++;
        }

        int left = 0, right = 0;
        int count = pat.length();

        while (right < txt.length()) {
            if (char_count[txt.charAt(right) - 'a']-- >= 1) {
                count--;
                right++;
            }


            if (count == 0) {
                result.add(left);

            }

            if (right - left == pat.length() && char_count[txt.charAt(left) - 'a']++ >= 0) {
                left++;
                count++;
            }


        }
        return result;
    }

    public static void main (String args[])
    {
        
        String txt = "abcd";
        String pat = "abc";
        List<Integer> result = findAnagrams(txt,pat);
        for(int ele :result)
        {
            System.out.println(ele);
            
        }
        
        
     }
    
    
}
