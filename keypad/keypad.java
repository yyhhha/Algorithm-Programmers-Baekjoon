import java.util.*;

public class keypad {

	public static void main(String[] args) {
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		
		String answer = "";
        int ldis = 0;
        int rdis = 0;
        int lcur =11;
        int rcur =22;
        int[] keypad = {1,2,3,4,5,6,7,8,9,11,0,22};
        
        for(int i =0 ;i<numbers.length;i++){
            int  temp = numbers[i];
            int count = 0;
            int cn=0;
            
            int lcount =0;
            int ln =0;
            
            int rcount =0;
            int rn =0;
            
            //왼쪽 
            if(temp == 7 || temp == 4 || temp ==1){
                answer +="L";
                lcur = temp;
                continue ;
            }
            //오른쪽
            else if(temp == 9 || temp == 6 || temp ==3){
                answer +="R";
                rcur = temp;
                continue ;
            //가운데 열.
            //거리비교.
            }else{
                //거리비교 
                //temp == 5 lcur ==7 rcur ==6 ldis ==2 rdis ==1 
                //5 -> (1,1)   7 -> (2,0)  6->(1,2)
                // i,j로 비교.. 
//            	 System.out.println("temp ="+temp+" "+lcur+" "+rcur);
                for(int j =0 ; j<keypad.length;j++){
                    if(temp == keypad[j]){
                        count = j;
//                        System.out.println("temp =" +temp);
//                        System.out.println("count =" +count);
                    }if(lcur == keypad[j]){
                        lcount = j;
//                        System.out.println("lcount ="+lcount);
                    }if(rcur == keypad[j]){
                        rcount = j;
//                        System.out.println("rcount = "+rcount);
                     }
                }
                cn = count%3;
                ln = lcount%3;
                rn = rcount%3;
                
                count =count/3;
                lcount = lcount/3;
                rcount = rcount/3;
                
                ldis = Math.abs(cn-ln) + Math.abs(count -lcount);
                rdis = Math.abs(cn-rn) + Math.abs(count - rcount);
//                System.out.println(Math.abs(cn-rn));
//                System.out.println(Math.abs(count - rcount));
//                
//                System.out.println(ldis+" "+rdis);
                
                if(ldis>rdis){
                     answer +="R";
                        rcur = temp;
                         continue ;
                }else if(rdis>ldis){
                     answer +="L";
                        lcur = temp;
                        continue ;
                //왼손잡이 ? 오른손잡이?
                }else if(ldis == rdis){
                    if(hand.equals("left")){
                        answer +="L";
                        lcur = temp;
                        continue ;
                    }else{
                        answer +="R";
                        rcur = temp;
                         continue ;
                    }
                }
                // if(ldis<=rdis&&hand.equals("left")){
                //     answer +="L";
                //     lcur = temp;
                //     continue ;
                // }else if(rdis<=ldis&&hand.equals("right")){
                //     answer +="R";
                //     rcur = temp;
                //     continue ;
                // }
            }
        }
        
//        return answer;
        System.out.println(answer);
    }
}
