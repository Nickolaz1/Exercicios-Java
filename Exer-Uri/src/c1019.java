import java.util.Scanner;
public class c1019 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int n, min, hr, seg;
		n = in.nextInt();
		hr = n/3600;
		seg = n%60;
		min = n/60;
		while(min>=60) {
			min -= 60;
		}
		System.out.println(hr+":"+min+":"+seg);
	}
}
