package hashmap;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FirstUniqueCharOfString {

    public static int findFirstUniqueChar(String str) {
        int[] freq = new int[26];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the string");
        try{
            String str=s.readLine();
            int firstcharIndex = findFirstUniqueChar(str);
            System.out.println("First unique character index :: "+firstcharIndex);
        }catch(Exception e){
            System.out.println("An error occurred");

        }
       
    }
}
