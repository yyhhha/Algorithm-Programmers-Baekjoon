package w14;

import java.util.ArrayList;
import java.util.Scanner;

public class baek8983 {

	
	/*
4 8 4
6 1 4 9 //사대 위치
7 2
3 3
4 5
5 1
2 2
1 4
8 4
9 4
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int M=0 ;//사대의 수
		int N=0; //동물의 수
		int L=0; //사정거리
		
		
		Scanner sc = new Scanner(System.in);
		M = sc.nextInt();
		N = sc.nextInt();
		L = sc.nextInt();
		
		int[] posM =new int[M];
		int [][] posN = new int[N][2];
		int [] checkN = new int[N];
		int count = 0;
		
		for (int i = 0; i < M; i++) {
			posM[i]=sc.nextInt();  //사대 위치 저장
		}
		
		for (int i = 0; i < N; i++) { //동물 위치 
			posN[i][0]=sc.nextInt();
			posN[i][1]=sc.nextInt();
			checkN[i] = 0;
		}
		
//		for (int i = 0; i < N; i++) { 
//			System.out.println(posN[i][0]+" , "+posN[i][1]);
//		}
		
		// 거리 비교 
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				
				if(checkN[j] == 1) {
					continue;
				}else {
					if(posN[j][1] +Math.abs(posM[i]-posN[j][0]) <=L) {
						checkN[j] =1;
						count ++;
					}
							
				}
			}
		}
		System.out.println(count);
	}

}
