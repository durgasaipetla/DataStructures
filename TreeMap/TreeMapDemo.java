package TreeMap;
import java.util.TreeMap;

public class TreeMapDemo {
public static void main(String[] args) {
	TreeMap<Object, Object>  map1 = new TreeMap<>();
	map1.put(1,100);
	map1.put(2,200);
	map1.put(3,"Bhanu");
	map1.put(4,new Student(1,"SAI",9.2f));
	map1.put(5,40.0f);
	System.out.println(map1);
}
}
