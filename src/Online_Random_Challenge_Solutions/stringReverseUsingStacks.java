package Java_Helper_Codes;

import java.util.*;

public class stringReverseUsingStacks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int len = s.length();
		
		CustomStack myStack = new CustomStack(len);
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			myStack.push(c);
		}
		System.out.println();
		for (int i = 0; i < s.length(); i++) {
			System.out.print(myStack.peek());
			char c = myStack.pop();
		}
	}

}
