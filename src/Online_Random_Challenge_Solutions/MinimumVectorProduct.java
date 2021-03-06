package programs;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class MinimumVectorProduct {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		int cases = input.nextInt();
		int j = 1;
		while(cases!=0){
			int n = input.nextInt();
			ArrayList<Integer> v1 = new ArrayList<>();
			ArrayList<Integer> v2 = new ArrayList<>();
			
			for (int i = 0; i < n; i++) {
				v1.add(input.nextInt());
			}
			for (int i = 0; i < n; i++) {
				v2.add(input.nextInt());
			}
			
			Collections.sort(v1);
			Collections.sort(v2);
			Collections.reverse(v2);
			
			Iterator<Integer> iterator1 = v1.iterator();
			Iterator<Integer> iterator2 = v2.iterator();
			int sum = 0;
			while (iterator1.hasNext()){
				int a = iterator1.next();
				int b = iterator2.next();
				int c = a * b;
				sum += c;
			}
			
			System.out.println("Case #"+j+": "+sum);
			j++;
			cases--;
		}
		PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
		System.setOut(out);
	}
}
