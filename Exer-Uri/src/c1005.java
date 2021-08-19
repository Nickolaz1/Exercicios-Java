import java.util.*;
public class c1005 {
    public static void main (String[]args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
        
        double a = in.nextDouble();
        double b = in.nextDouble();
        
        double media = ((a*3.5)+(b*7.5))/11;
        
        System.out.printf ("MEDIA = %.5f%n",media);
    }
}
