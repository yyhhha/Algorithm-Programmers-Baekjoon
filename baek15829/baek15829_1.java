import java.util.Scanner;

public class baek15829_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int len = scan.nextInt();
		String s = scan.next();
		long  answer = 0; 
		
		for(int i = 0; i < len; i++) {
			answer += (s.charAt(i) - 'a' + 1) * Math.pow(31, i) ;
		}
		System.out.println(answer);
	}
}
