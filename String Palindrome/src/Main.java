import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String revStar="";
        /* Enter your code here. Print output to STDOUT. */
        int strLen=A.length();
        for(int i=(strLen-1);i>=0;--i)
        {
            revStar=revStar+A.charAt(i);
        }
        if(A.toLowerCase().equals(revStar.toLowerCase()))
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}



