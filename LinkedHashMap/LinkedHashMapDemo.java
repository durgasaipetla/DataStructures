package LinkedHashMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;


public class LinkedHashMapDemo {
public static void main(String[] args) {
	LinkedHashMap <Object,Object> map = new LinkedHashMap<>();
	//Based on Insertion order the output will come
	map.put(1,10);
	map.put(2,2000);
	map.put(3,500);
	map.put("Four",new Student(1,"Bhanu",7.8f));
	map.put(5,10);
	System.out.println(map);
	
	//Accessing the keys only using keySet() METHOD which returns a set object
	Set keys = map.keySet();
	System.out.println("Keys: "+ keys);
	
	
	//Accessing the key-value pairs using emptySet() METHOD which returns a set object
	Set Ky = map.entrySet();
	System.out.println("Key-Values: "+ Ky);
	
	//Accessing the only value  using values() METHOD which returns a Collection object
		Collection values = map.values();
		System.out.println("Values: "+ values);
		
	

}
}
