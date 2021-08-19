import java.util.*;
public class c1014 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner (System.in);
		
		int Km;
		double Litros, Media;
		
		Km = in.nextInt();
		Litros = in.nextDouble();
		
		Media = Km/Litros;
		
		System.out.printf("%.3f km/l%n",Media);

	}

}
