import java.util.*;
public class c1006 {
    public static void main (String[]args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
        
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();
        
        double media = ((a*2)+(b*3)+(c*5))/10;
        
        System.out.printf ("MEDIA = %.1f%n",media);
    }
}
