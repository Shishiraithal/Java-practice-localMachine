package leetcode;

import java.util.Arrays;

public class AssignCookie {
    public int findContentChildren(int[] g,int[] s)
    {
        Arrays.sort(g);
        Arrays.sort(s); 
        int contentChildren = 0;
        int greedSize = g.length-1;
        int cookieSize = s.length-1;
        while (greedSize >= 0 && cookieSize >= 0) {
            if (s[cookieSize] >= g[greedSize]) {
                contentChildren++;
                greedSize--;
                cookieSize--;

            } else {
                greedSize--;
            }


        }
        return contentChildren;
    }
    public static void main(String args[]) {
        int greedArray[]    =    new int[]{1,2,3}; 
        int[] cookieSizeArr =   new int[]{1,1}; 
            AssignCookie AssCook = new AssignCookie();
            
           int  result = AssCook.findContentChildren(greedArray, cookieSizeArr);
            System.out.println("Content children "+result);
        
        }
}
