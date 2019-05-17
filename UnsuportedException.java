import java.util.Arrays;
import java.util.List;

public class UnsuportedException {

	
	public static void main(String[] args) {
		String[] flowers = { "Ageratum", "Allium", "Poppy", "Catmint" }; 
		List<String> flowerList = Arrays.asList(flowers); 
		flowerList.add("Celosia");
	}
}
