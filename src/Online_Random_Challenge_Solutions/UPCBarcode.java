package binaryIO;

import java.util.Scanner;

public class UPCBarcode {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] barCode = new int[11];
		for (int i = 0; i < barCode.length; i++) {
			barCode[i] = input.nextInt();
		}
		
		int Sum = 0;
		for (int i = 1; i < barCode.length; i+=2) {
			Sum += barCode[i];
		}
		Sum *= 3;
		
		for (int i = 0; i < barCode.length; i+=2) {
			Sum += barCode[i];
		}
		
		int remainder = Sum%10;
		if(remainder!=0)
			remainder = 10 - remainder;
		
		for (int i = 0; i < barCode.length; i++) {
			System.out.print(barCode[i] + " ");
		}
		System.out.print(remainder);
		System.out.println();
		
		
	}

}
