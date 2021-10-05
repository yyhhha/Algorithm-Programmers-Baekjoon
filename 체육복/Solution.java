import java.util.Arrays;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        Arrays.sort(lost);
	  	Arrays.sort(reserve);
        
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
                if(lost[i] ==32 ) continue;
				//여벌의 옷을 가지고 있는 학생이 이미 빌려줌. 
				if(reserve[j] ==34) continue;
				
                
				if(lost[i] == reserve[j]) {
					answer++;
					lost[i] =32; // 학생수가 2~30까지 
					reserve[j] =34;
					continue ;
				}
			}
		}
        
        for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				//+1 -1
				if(lost[i]+1 == reserve[j] || lost[i]-1 == reserve[j]) {
					answer++;
					lost[i] =32; // 학생수가 2~30까지 
					reserve[j] =34;
					continue ;
				}
			}
		}
        return answer;
    }
}
