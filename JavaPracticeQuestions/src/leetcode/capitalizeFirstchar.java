package leetcode;


public class capitalizeFirstchar {
    
    public static String capitalizeWord(String str){  
        String words[]=str.split("\\s");  
        String capitalizeWord="";  
        for(String w:words){  
            String first = w.substring(0,1);  
            String afterfirst = w.substring(1);  
            capitalizeWord+=first.toUpperCase()+afterfirst+" ";  
        }  
        return capitalizeWord.trim();  
    }  
    
    public static void main(String[] args) {
        capitalizeFirstchar capitalizeFirstchar = new capitalizeFirstchar();
        System.out.println(capitalizeFirstchar.capitalizeWord("my name is khan"));  
    }
}
