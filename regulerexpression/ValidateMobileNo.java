package regulerexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateMobileNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the mobile number with country code");
        String mobileNo = sc.nextLine();
        String regex = "^(\\+\\d{1,3}[- ]?)?\\d{10}$";
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(mobileNo);
        if (mobileNo.length() != 13) {
            System.out.println("Mobile number should be 13 characters long including country code");
        }
        if (!mobileNo.matches(".*\\d{10}.*")) {
            System.out.println("Mobile number must contain at least 10 digits.");
        }
        if (!mobileNo.matches(".*\\+\\d{1,3}[- ]?")) {
            System.out.println("Mobile number must contain a valid country code.");
        }
        if (m.find() && m.group().equals(mobileNo)) {
            System.out.println("Valid mobile number");
        } else {
            System.out.println("Invalid mobile number");
        }
        sc.close();
    }
}
