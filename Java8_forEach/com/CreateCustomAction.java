package Java8_forEach.com;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class CreateCustomAction {
public static void main(String[] args) {
	HashMap<String, Integer> map = new HashMap<>();
    
	map.put("A", 1);
	map.put("B", 2);
	map.put("C", 3);
	 
	Consumer<Map.Entry<String, Integer>> action=entry->{
		System.out.println(map.entrySet());
		System.out.println(entry.getValue());
	};
	
	map.entrySet().forEach(action);
}
}
