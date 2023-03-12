import java.util.Scanner;

public class Main {

    public static String getSmallestAndLargest(String s, int k)
    {
        String smallest = "";
        String largest = "";
        // Complete the function
        int count=s.length();
        int last=count-k;
        smallest=s.substring(last,count);
        largest=s.substring(0,k);
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}