package w15;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1406
/*
abcd
3
P x
L
P y
 */
public class baek1406 {

	public static void main(String[] args) {
		String ans = "";
		Scanner sc = new Scanner(System.in);

		ans = sc.next();
		int n = sc.nextInt();
		int cur = ans.length();

		for (int i = 0; i <= n; i++) {

			String tmp = sc.nextLine();
			String[] strAl = tmp.split(" ");
			
//			System.out.println(cur);
			if (strAl[0].equals("P")) {
				String head = ans.substring(0, cur);
				if(cur!=ans.length()) {
					String tail = ans.substring(cur, ans.length());
					head += strAl[1];
					ans = head + tail;
					cur ++;
				}else {
					head += strAl[1];
					ans = head;
					cur++;
				}
				continue;
			}else if (strAl[0].equals("L")) {
				if (cur != 0) {
					cur--;
//					System.out.println(cur);
					continue;
				}
			} else if (strAl[0].equals("D")) {
				if (cur != ans.length()) {
					cur++;
					continue;
				}
			} else if (strAl[0].equals("B")) {
				if (cur != 0) {
					String head = ans.substring(0, cur -1);
					String tail = ans.substring(cur, ans.length());
					ans = head + tail;
					cur--;
					continue;
				}
			}
		}
		System.out.println(ans);
	}
}
