package code.edu.dsm.dmacc.hw20;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RunnerHw20 {

	public static void main(String[] args) {

		List<String> valueArr = Arrays.asList("Dog", "Cat", "Bird", "Monkey", "Donkey");

		List<Integer> lengthOfArrayItems = valueArr.stream().map(x -> x.length()).collect(Collectors.toList());
		System.out.println("Length of each array Item : s" + lengthOfArrayItems);

		List<Character> result = valueArr.stream().flatMapToInt(String::chars)
				.mapToObj(i -> Character.valueOf((char) i)).collect(Collectors.toList());
		System.out.println("List of Chars in String List:" + result);

		List<String> stringwithD = valueArr.stream().filter(x -> x.charAt(0) == 'D').collect(Collectors.toList());
		System.out.println("String Starting with D : " + stringwithD);

		Integer sum = valueArr.stream().map(x -> x.length()).reduce((element, accumulator) -> (element + accumulator))
				.orElse(0);
		System.out.println("Sum of length of String inputs : " + sum);

	}

}
