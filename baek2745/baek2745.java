package al;

import java.util.Scanner;

public class baek2745 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String str=sc.next();
		 int b = sc.nextInt();
		 
		 int sum =0;
		 for (int i = 0; i < str.length(); i++) {
			 if('0' <= str.charAt(i) && '9'>=str.charAt(i)) {
				 int temp1 = str.charAt(i)-'0';
				 sum += temp1*Math.pow(b, str.length()-i-1);
			 }else {
				 int temp1 = str.charAt(i)-'A'+10;
				 sum += temp1*Math.pow(b, str.length()-i-1);
			 }
		}
		 sc.close();
		 System.out.println(sum);
	}

}
