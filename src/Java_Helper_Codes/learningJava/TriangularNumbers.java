package learningJava;

import java.util.Scanner;

public class TriangularNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int nextNum = 1;
		for (int i = 2; i < n; i++) {
			nextNum = i + nextNum;
			System.out.println(nextNum);
		}
	}

}
