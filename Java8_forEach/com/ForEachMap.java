package Java8_forEach.com;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class ForEachMap {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("A", 1);
		map.put("B", 2);
		map.put("C", 3);

		// 1. Map entries
		Consumer<Map.Entry<String, Integer>> action = System.out::println;
		map.entrySet().forEach(action);

		// 2. Map keys
		Consumer<String> keySet = System.out::println;
		map.keySet().forEach(keySet);

		// 3. Map values
		Consumer<Integer> values = System.out::println;
		map.values().forEach(values);
	}

}
