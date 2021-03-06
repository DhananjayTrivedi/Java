package Java_Helper_Codes;

public class PerformanceTest {
	public static void main(String[] args) {
		getTime(10000000);
		getDoubleTime(100000);
		getTime(1000000000);
		getTime(999999999);
	}

	private static void getTime(long n) {
	
		long startTime = System.currentTimeMillis();
		int k = 0;
		for (int i = 0; i < n; i++) {
			k += 5;
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + " milliseconds");
	}
	
	private static void getDoubleTime(long n) {
		
		long startTime = System.currentTimeMillis();
		int k = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				k += 5;
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime + " milliseconds");
	}
}
