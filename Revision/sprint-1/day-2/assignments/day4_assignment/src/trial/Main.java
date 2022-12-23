package trial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        System.out.println(list);
        
        Collections.reverse(list);
        
        list.add(10);
        
        Collections.reverse(list);
        
        System.out.println(list);

	}

}
