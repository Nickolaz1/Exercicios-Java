import java.util.*;
public class c1011 {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		double R, Raio, Volume;
		
		R = in.nextDouble();
		
		Raio = R * R * R;
		Volume = (4/3.0) * 3.14159 * Raio;
		
		System.out.printf("VOLUME = %.3f%n",Volume);
		
	}
}
