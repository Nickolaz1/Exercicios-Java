package exercicios;

import java.util.Scanner;

public class Problema_B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);

		int l = in.nextInt();
		int i, j, dp = 0, ds = 0, x = 0, y = 0, z = l - 1;
		int vetorx[] = new int[l], vetory[] = new int[l];
		int matriz[][] = new int[l][l];

		if (l <= 0 || l > 9) {
			System.exit(0);
		}

		for (i = 0; i < l; i++) {
			for (j = 0; j < l; j++) {
				matriz[i][j] = in.nextInt();
				if (i == j) {
					vetorx[x] = matriz[i][j];
					dp += vetorx[x];
					x++;
				}
				if (j == z) {
					vetory[y] = matriz[i][j];
					ds += vetory[y];
					y++;
					z--;
				}
			}
		}

		System.out.println(dp + " " + ds);

	}

}
