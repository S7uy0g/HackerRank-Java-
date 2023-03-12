import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int aLen=A.length();
        int bLen=B.length();
        int sum=aLen+bLen;
        System.out.println(sum);
        String s1 = A.substring(0, 1).toUpperCase();
        String aCap = s1 + A.substring(1);
        String s2 = B.substring(0, 1).toUpperCase();
        String bCap= s2 + B.substring(1);
        if(aCap.compareTo(bCap)>0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        System.out.println(aCap+" "+bCap);

    }
}



