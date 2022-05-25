import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Runner {



	public static void removeAllItemsFromList(List<String> str) {

		Iterator <String> iterator = str.iterator();
		while(iterator.hasNext()) {
			iterator.next();
			iterator.remove();
		}
	}

	public static ArrayList<Integer> range(int start, int end) {
		ArrayList<Integer> res = new ArrayList<>();
		for (int i =start; i < end; i++) {
			res.add(i);
		}
		return res;
	}

	public static ArrayList<Integer> double_each(ArrayList<Integer> inputList) {
		ArrayList<Integer> res = new ArrayList<Integer>(inputList);
		ListIterator<Integer>iterator=res.listIterator();
		  while (iterator.hasNext()) {
			  iterator.set(iterator.next()*2);
			  }
		return res;
	}
	
	public static ArrayList<Integer> complexify_each(ArrayList<Integer> inputList) {
		ArrayList<Integer> res = new ArrayList<Integer>(inputList);
		ListIterator<Integer>iterator=res.listIterator();
		  while (iterator.hasNext()) {
			  iterator.set(iterator.next()*4+3);
			  }
		return res;
	}

	public static void main(String[] args) {
		//		List<String> strList = new ArrayList<String>();
		//		strList.add("10");
		//		strList.add("20");
		//		strList.add("30");
		//		strList.add("45");
		//		strList.add("222");
		//		System.out.println(strList);
		//		removeAllItemsFromList(strList);
		//		System.out.println(strList);

		ArrayList<Integer> input = range(1, 10);
		ArrayList<Integer> doubled = double_each(input);
		ArrayList<Integer> complexified = complexify_each(input);
		System.out.println(input);
		System.out.println(doubled);
		System.out.println(complexified);

	}







}
