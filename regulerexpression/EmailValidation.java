package regulerexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the email address");
        String email = sc.nextLine();
        String regex = "^[a-zA-Z0-9-.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(email);
        if (email.length() > 50) {
            System.out.println("Email address should not exceed 50 characters");
        }
        if (!email.matches(".*[a-zA-Z0-9-.]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}.*")) {
            System.out.println("Email address must contain a valid format");
        }
        if (m.find() && m.group().equals(email)) {
            System.out.println("Valid email address");
        } else {
            System.out.println("Invalid email address");
        }
        sc.close();
    }
}
