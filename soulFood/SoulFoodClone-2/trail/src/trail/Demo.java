package trail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		
		
		List<Integer> list = Arrays.asList(2,4,6,8,9);
		
		List<Integer> list1 = new ArrayList<>(list);
		
		list1.removeIf(l -> l==6);
		
		System.out.println(list1);

	}

}
