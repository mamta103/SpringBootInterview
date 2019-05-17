import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDefulatSorting {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(0);
		list.add(15);
		list.add(5);
		list.add(20);
		System.out.println("Before Sorting-> " + list);
		Collections.sort(list, new MyComparator());
		System.out.println("After Sorting-> " + list);

	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer objInt1, Integer objInt2) {

		return (objInt1 > objInt2 ? -1 : (objInt1 < objInt2) ? +1 : 0);

	}

}