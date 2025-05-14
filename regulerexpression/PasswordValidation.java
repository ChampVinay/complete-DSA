package regulerexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidation {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the password");
        String password=sc.nextLine();
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(password);
        if(password.length()>8){
            System.out.println("passsword should be more than 8 characters with at least one uppercase letter, one lowercase letter, one digit, and one special character");
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must contain at least one uppercase letter.");
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must contain at least one lowercase letter.");
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must contain at least one digit.");
        }
        if (!password.matches(".*[@#$%^&+=].*")) {
            System.out.println("Password must contain at least one special character (@#$%^&+=).");
        }
        if(m.find() && m.group().equals(password)){
            System.out.println("valid identifier");
        }else{
            System.out.println("invalid identifier");
        }
        sc.close();
        
    }
}
