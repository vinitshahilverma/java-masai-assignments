import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
	   
        String str = "wish";
        
        HashMap<Character,Integer> map = new HashMap<>();
 
        for(int i=0; i<str.length(); i++){
              map.put(str.charAt(i),0);
        }
        
        String str1 = "wishwish";
        int count = 0;
        for(int i=0; i<str1.length(); i++){
            if(map.containsKey(str1.charAt(i))) {
            	 int sum = map.get(str1.charAt(i));
            	  map.put(str1.charAt(i),sum+1);
            }
         }
        
        
        System.out.println(map);

	}

}
