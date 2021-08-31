import java.util.HashMap;
import java.util.Map;

public class proParticipant2 {

	public static void main(String[] args) {
		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		Map<String, Integer> hash = new HashMap<>();
		for (String arg : participant) {
			hash.put(arg, hash.getOrDefault(arg, 0) + 1);
		}
		for (String arg : completion) {
			hash.put(arg, hash.get(arg) - 1);
		}
		for (String key : hash.keySet()) {
			if (hash.get(key) != 0) {
				System.out.println(key);
			}
		}
	}

}
