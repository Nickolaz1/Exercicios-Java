import java.util.*;
public class c1007{
    public static void main(String[]args){
        @SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int diferenca = a*b - c*d;
        System.out.println("DIFERENCA = " + diferenca);
    }
}
