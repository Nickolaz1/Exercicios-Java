import java.util.*;
public class c1002 {
    public static void main (String[]args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
        
        double pi = 3.14159;
        double raio = in.nextDouble();
        double area = pi*raio*raio;
        
        System.out.printf("A=%.4f%n",area);
    }
}
