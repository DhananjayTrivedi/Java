package programs;
import java.util.Arrays;
import java.util.Scanner;
public class NbitsStrings {
	int count = 1;
	int[] arrA;
	public static void main(String[] args) throws java.lang.Exception {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		NbitsStrings i = new NbitsStrings(n);
		i.nBits(n); // Generate bits
		
	}
	public NbitsStrings(int n) {
		arrA = new int[n];
	}
	public void nBits(int n) {
		if (n <= 0) {
			StringBuilder builder = new StringBuilder();
			for (int value : arrA) {
			    builder.append(value);
			}
			boolean flag = false;
			String text = builder.toString();
			if(text.charAt(0) == '1' && text.charAt(text.length() - 1) == '1'){	
				while(true){
					for (int i = 2; i < 11; i++) {
						if(isPrime(findValue(text,i)))
							flag = true;
						else
							break;
					}
					break;
				}
				//Printing the final prime binary string
				if(!flag){
					System.out.print(text + " ");
				}
			}
		}
		else {
			arrA[n - 1] = 0;
			nBits(n - 1);
			arrA[n - 1] = 1;
			nBits(n - 1);
		}
	}
	//Return Value at any Base
	public static int findValue(String s, int base) {
		StringBuilder rev = new StringBuilder(s);
		String string = rev.reverse().toString();
		int value = 0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i) == '1'){
				value += Math.pow(base, i);
			}
		}
		return value;
	}
	//Method to Check For Prime
	public static boolean isPrime(int num){
	    if ( num > 2 && num%2 == 0 ) {
	        return false;
	    }
	    int top = (int)Math.sqrt(num) + 1;
	    for(int i = 3; i < top; i+=2){
	        if(num % i == 0){
	        	return false;
	        }
	    }
	    return true; 
	}
}