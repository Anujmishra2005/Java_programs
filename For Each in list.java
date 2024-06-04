package Mathematics;

import java.util.ArrayList;

public class ForEachinList {
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
	list.add("Hello");
	list.add("java");
	list.add("Programming");
	list.add("Using for Each Method");
	list.add("in Array List");
	
	System.out.println(list);
	list.forEach(x -> System.out.println(x));
	
	}

}
