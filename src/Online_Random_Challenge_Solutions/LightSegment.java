package binaryIO;
import java.util.Scanner;
public class LightSegment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int caseNumber = input.nextInt();
		while(caseNumber >0){
			String time = input.next();
			String[] ary = time.split("");
			int pos = time.indexOf(":");
			String hrs = time.substring(0,pos);
			String mins = time.substring(pos+1,time.length());
			String totalTime = hrs+mins;
			int power = 20;
			for (int i = 0; i < time.length(); i++){
				char c = time.charAt(i);        
				power += checkPowerConsumption(c);
			}
			System.out.println(power*10+" milliAmpere");
			
		}
	caseNumber--;
	}
	private static int checkPowerConsumption(char num) {
		switch(num){
		case '1':
			return 30;
		case '2':
			return 75;
		case '3':
			return 75;
		case '4':
			return 60;
		case '5':
			return 75;
		case '6':
			return 90;
		case '7':
			return 45;
		case '8':
			return 105;
		case '9':
			return 75;
		case '0':
			return 90;
		}
		return 0;
	}
}
