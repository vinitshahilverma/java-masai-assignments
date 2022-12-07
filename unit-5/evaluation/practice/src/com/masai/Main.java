package com.masai;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

         int[] arr = new int[5];
         
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 3;
        arr[4] = 1;
        
        HashMap< Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<arr.length; i++) {
        	map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        
        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        
        for(Map.Entry<Integer,Integer> m:set) {
        	   if(m.getValue()==1) {
        		   System.out.println(m.getKey());
        		   break;
        	   }
        }

	}

}
