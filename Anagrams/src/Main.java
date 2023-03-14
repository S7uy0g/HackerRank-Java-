import java.util.Scanner;

public class Main {

    static boolean isAnagram(String x, String y)
    {
        // Complete the function
        String a=x.toLowerCase();
        String b=y.toLowerCase();
        char[] inp1=a.toCharArray();
        char[] inp2=b.toCharArray();
        boolean isVisited[] = new boolean[b.length()];
        boolean isAnagram = false;
        if(a.length()==b.length())
        {
            for(int i=0;i<a.length();i++)
            {
                char c=inp1[i];
                isAnagram=false;
                for(int j=0;j<b.length();j++)
                {
                    if(c==inp2[j] && !isVisited[j])
                    {
                        isAnagram = true;
                        isVisited[j] = true;
                        break;
                    }
                }
                if(!isAnagram)
                {
                    break;
                }
            }
            if(isAnagram)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}