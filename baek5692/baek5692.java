import java.util.Scanner;

public class baek5692 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			int length = (int) (Math.log10(num) + 1);
			if(num == 0) break;
			int sum = 0;
			int num2 = 0;
			for (int i = 1; i <= length; i++) {
				num2 = (int) (num % Math.pow(10, 1)); //
				num = num/10;
				sum += (num2*factorial(i));
			}
			System.out.println(sum);
		}
	}

	public static int factorial(int n) {
		if (n <= 1)
			return n;
		else 
			return factorial(n-1) * n;

	}
}
