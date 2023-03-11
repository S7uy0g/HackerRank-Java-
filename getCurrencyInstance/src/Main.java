import java.util.*;
import java.text.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        if(payment>=0&&payment<=Math.pow(10,9))
        {
            NumberFormat nf1=NumberFormat.getCurrencyInstance(Locale.US);
            String us=nf1.format(payment);
            NumberFormat nf2=NumberFormat.getCurrencyInstance(new Locale("en","IN"));
            String india=nf2.format(payment);
            NumberFormat nf3=NumberFormat.getCurrencyInstance(Locale.CHINA);
            String china=nf3.format(payment);
            NumberFormat nf4=NumberFormat.getCurrencyInstance(Locale.FRANCE);
            String france=nf4.format(payment);
            System.out.println("US: " + us);
            System.out.println("India: " + india);
            System.out.println("China: " + china);
            System.out.println("France: " + france);
        }
    }
}