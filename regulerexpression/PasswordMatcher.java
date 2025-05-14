package regulerexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordMatcher {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("inter your password");
        String password=sc.nextLine();
        Pattern p=Pattern.compile(password);
        System.out.println("conform your password plz");
        String confPass=sc.nextLine();
        Matcher m=p.matcher(confPass);
        if(m.find()){
            System.out.println("YOU ARE LOGIN SUCCESSFULLY");
        }else{
            System.out.println("please enter a valid password");
        }

        sc.close();
    }
}
