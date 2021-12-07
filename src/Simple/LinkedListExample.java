package Simple;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> LList = new LinkedList<String>();
		LList.add("a");
		LList.add("b");
		LList.add("c");
		LList.add("d");
		
		String[] array = {"d","c","b","a"};
		for(String s:array) {
			LList.add(s);
		}
		
		Collections.sort(LList);
		
		Iterator<String> itr=LList.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		
	}
	
}
