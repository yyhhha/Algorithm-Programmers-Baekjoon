class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
	
		String [] sol = new String[n];
		
		for(int i=0 ;i<n;i++) {
			sol[i] =Integer.toBinaryString(arr1[i]|arr2[i]);
		}

		for (int i = 0; i < sol.length; i++) {
			sol[i] = String.format("%"+n+"s", sol[i]);
			sol[i] = sol[i].replace("1", "#"); 
			sol[i] = sol[i].replace("0", " "); 
		}
		
	return sol;
    }
}
