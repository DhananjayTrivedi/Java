import java.util.*;
public class diagonalDifference {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[][] arr = new int[size][size];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		int d1 = 0,d2 = 0;
		for (int i = 0; i < arr.length; i++) {
			d1 += arr[i][i];
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			d2 += arr[i][arr.length - 1 - i];
		}
		if(d2 - d1 > 0)
			System.out.println(d2 - d1);
		else
			System.out.println(d1 - d2);
	}

}
