import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer =0; // 시간을 측정.
		int curWeight =0 , idx =0;
		//1차선 다리를 큐로 생성
		Queue<Integer> queue = new LinkedList<>();
		
		while(true) {
			//마지막 트럭이 다리에 올라갔을 때
			if(idx == truck_weights.length) {
				break;
			}
			//다리 길이만큼 트럭이 올라간경우
			if(queue.size() == bridge_length) {
				curWeight -= queue.poll();
       //무게가 초과한 경우
			}else if(curWeight+truck_weights[idx]>weight){
				queue.offer(0);
				answer ++;
			}else {
				queue.offer(truck_weights[idx]);
				curWeight += truck_weights[idx];
				answer ++;
				
				idx ++;
			}
		}
		return answer + bridge_length;
	}
    
}
