import java.util.Set;
import java.util.TreeSet;

//Lecture 17. Sorting Elements of TreeSet with Lambda Expression

public class SortingTreeSetLamdaExp {
public static void main(String[] args) {
	Set<Integer> set= new TreeSet<Integer>((objRef01, objRef02)-> (objRef01>objRef02)?1:(objRef01<objRef02)?-1:0);
	set.add(10);
	set.add(0);
	set.add(15);
	set.add(5);
	set.add(20);
	set.add(25);

	System.out.println("After Sorting-> " + set);

}
}
