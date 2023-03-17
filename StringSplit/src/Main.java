import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        s=s.trim();
        if (s.length() == 0) {
            System.out.println(0);
        } else {
            String reg = "[!,?.\\s*_'@]+";
            String[] ans=s.split(reg);
            System.out.println(ans.length);
            for(String w:ans){
                System.out.println(w);
            }
        }
        scan.close();
    }
}

