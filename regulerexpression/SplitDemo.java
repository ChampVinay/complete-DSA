package regulerexpression;

import java.util.regex.Pattern;

public class SplitDemo {
    public static void main(String[] args) {
        Pattern p=Pattern.compile("\\.");
        String [] s=p.split("www.vinay.software.solutions");

        for(var i:s){
            System.out.println(i);
        }
    }
}
