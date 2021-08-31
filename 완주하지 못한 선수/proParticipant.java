import java.util.Arrays;

public class proParticipant {

	public static void main(String[] args) {
		String[] arr1 = { "leo", "kiki", "eden" };
		String[] arr2 = { "eden", "kiki" };

		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i;
		for ( i = 0; i < arr2.length; i++) {
			if(!arr1[i].equals(arr2[i])) {
				System.out.println(arr1[i]);
			}
		}
		System.out.println(arr1[i]);
	}

}
