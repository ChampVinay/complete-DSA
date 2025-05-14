package regulerexpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LongestSubstring {
    public static void main(String[] args) {
        
        Pattern p=Pattern.compile("geeks");
        Matcher m=p.matcher("geekforgeeks");
        if(m.find()){
            System.out.println(m.start()+"...."+ m.end());
        }
    }
}
