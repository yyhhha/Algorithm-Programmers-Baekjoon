class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = new int[progresses.length];
        //남은 일자 계산 
        for(int i=0; i < progresses.length;i++){ 
        	int prog = progresses[i];
        	int workingTime = 0;
        	while(true){
        		if(prog >= 100) break;
        		prog += speeds[i];
        		workingTime++; 
        	}
        	answer[i] = workingTime;
        }
        
      //위에 구한 일자로 계산. 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0 ; i < answer.length ; i++){  
            int count = 1;
            if(answer[i] < 0){continue;} 
            for(int j=i+1 ; j < answer.length ; j++){  
            	if(answer[i] >= answer[j]){
            		answer[j] = -1; 
            		count++;
            	} else {
            		break;
            	}
            }
            list.add(count);
        }
      
        answer = list.stream().mapToInt(i ->i).toArray();
        return answer;
    }
}
