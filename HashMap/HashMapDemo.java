package HashMap;

import java.util.HashMap;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap <Object,Object>map = new HashMap<>();
	map.put(1,10);
	map.put(2,2000);
	map.put(3,500);
	map.put("Four",new Student(1,"Bhanu",7.8f));
	map.put(1,10);
	System.out.println(map);
	}
}
