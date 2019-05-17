package StreamAPIJava8;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamBuilders {

	public static void main(String[] args) {

		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		Consumer<Integer> action = System.out::println;
		stream.forEach(action);
		System.out.println("************************************");
		Stream<Integer> stream2= Stream.of(new Integer[] {6,7,8,9});
		stream2.forEach(p->System.out.println(p));
	}

}
