import java.util.Map;
import java.util.TreeMap;

public class SortingTreemapLamdaExp {
	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<Integer, String>(
				(obj1, obj2) -> (obj1 > obj2) ? 1 : (obj1 < obj2) ? -1 : 0);
		m.put(100, "Durga");
		m.put(600, "Sunny");
		m.put(300, "Bunny");
		m.put(200, "Chinny");
		m.put(700, "Vinny");
		m.put(400, "Pinny");
		System.out.println(m);
	}
}
