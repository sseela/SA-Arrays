package streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatedNumbers {
	public static void main(String[] args) {
		int[] arr = { 0,1,1,2,4,5,3,3,1,0,1 };
		/*HashSet<Integer> set = new HashSet<>();
		for(int i=0; i<arr.length; i++) {
			if(!set.add(arr[i])) {
				System.out.println(arr[i]);
			}
		}*/
		
		Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
	}
}
