package ConcurrentModification;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentDemo {
public static void main(String[] args) {
	ArrayList  list =new ArrayList();
	list.add(10);
	list.add(20);
	list.add(30);
	list.add(40);
	int temp=40;
	for (int i = 0; i < list.size()-1; i++) { ///INFINTITE CONCURRENT LOOP
		System.out.println(list.get(i));
		list.add(temp);
		temp+=10;
		if(i==50) {
			return;
		}
		
	}
	for (Object x : list) {
		System.out.println(list.get((int) x)+"Sai");
		temp+=10;
	}
	//Concurrent modification with iterrator ==> Concurrent modification exception
	Iterator itr = list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()+" ");
		list.add(temp+=10);
	}
}
}
