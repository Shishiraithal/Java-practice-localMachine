package leetcode;

import java.util.HashSet;
import java.util.Set;

public class numUniqueEmails {
   

    public Set numUniqueEmail(String[] emails){
        Set <String> unique_emails = new HashSet();
        for(String email:emails)
        {
            int split_Position = email.indexOf("@"); 
            String username= email.substring(0,split_Position);
            String domain_name = email.substring(split_Position);
            
            System.out.println(username);
            System.out.println(domain_name);
            
            if(username.contains("+"))
            {
                int plus_postion = username.indexOf("+");
                username = username.substring(0,plus_postion);  
                
            }
            username = username.replaceAll("\\.", "");
            String clean_username =username+domain_name;
            unique_emails.add(clean_username);
            
            
        }
        
        
        return unique_emails;
        }
    
    public static void main(String[] args) {
        numUniqueEmails numUniqueEmails = new numUniqueEmails();
        String[] emails = {"shishir+aithal@gmail.com","123.romeo@gmail.com"};
        System.out.println(numUniqueEmails.numUniqueEmail(emails));
    }
}
