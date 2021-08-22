
import java.util.Scanner;

public class Main {

	static int[][] check;
	static boolean[] checked;
	static int n; // 정점개수
	static int m; // 간선개수
	static int start; // 시작정점
	static int count =0;
  
  
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		start = 1;
		
		check = new int[101][101]; // 좌표를 그대로 받아들이기 위해 +1해서 선언
		checked = new boolean[101]; // 초기값 False

		for (int i = 0; i < m; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();

			check[x][y] = check[y][x] = 1;
		}
		dfs(start);
		
		System.out.println(count);
	}
	private static void dfs(int num) {
		checked[num] = true;
		
		
		for (int j = 1; j <= n; j++) {
			if (check[num][j] == 1 && checked[j] == false) {
				count ++;
				dfs(j);
			}
		}
	}

}
