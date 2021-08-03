import java.util.ArrayList;
class Solution {
    public int[] solution(int[] answers) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,1,2,3,2,4,2,5};
        int[] arr3 = {3,3,1,1,2,2,4,4,5,5};

        int cnt1=0;
        int cnt2=0;
        int cnt3=0;

        for (int i = 0; i < answers.length; i++) {
            if(answers[i] == arr1[i% arr1.length]) {
                cnt1 ++;
            }
            if(answers[i] == arr2[i% arr2.length]) {
                cnt2 ++;
            }
            if(answers[i] == arr3[i% arr3.length]) {
                cnt3 ++;
            }
        }
        int maxValue = Math.max(Math.max(cnt1,cnt2),cnt3);
        ArrayList<Integer> sol = new ArrayList<>() ;

        if(maxValue == cnt1) sol.add(1);
        if(maxValue == cnt2) sol.add(2);
        if(maxValue == cnt3) sol.add(3);

        int [] arr = new int[sol.size()];
        int size =0 ;
        for(int temp : sol) {
            arr[size++] = temp;
        }

        return arr;
    }
}
