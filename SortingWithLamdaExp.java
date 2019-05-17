import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingWithLamdaExp {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<Integer>(Arrays.asList(10,15,0,5,20));
	System.out.println("Before Sorting-> " + list);

	Collections.sort(list, (objectRef1, objectRef2)-> (objectRef1> objectRef2) ?1: (objectRef1 <objectRef2) ?-1:0);
	System.out.println("After Sorting-> " + list);

	
	
}
}
