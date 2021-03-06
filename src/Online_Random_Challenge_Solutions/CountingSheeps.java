package programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.*;

public class CountingSheeps {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		int testCases = input.nextInt();
		int count = 0;
		while(testCases != 0){
			count++;
			HashMap<Integer,Integer> map = new HashMap<>();
			map.put(1, 0);
			map.put(2, 0);
			map.put(3, 0);
			map.put(4, 0);
			map.put(5, 0);
			map.put(6, 0);
			map.put(7, 0);
			map.put(8, 0);
			map.put(9, 0);
			map.put(0, 0);
			
			int n = input.nextInt();
			if(n == 0){
				System.out.println("Case #" + count + ": " + "INSOMNIA");
				continue;
			}
			int i = 1;
			int temp = 0;
			while(true){
				int number = n * i;
				temp = number;
				LinkedList<Integer> stack = new LinkedList<Integer>();
				while (number > 0) {
					map.put(( number % 10), 1);
				    number = number / 10;
				}
				if(!(map.containsValue(0))){
					System.out.println("Case #" + count + ": "+temp);
					break;
				}
				i++;
			}	
			testCases--;
		}
	}
}
