import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {

	public static void main(String[] args) {
		
		GenericClass <Integer> generic = new GenericClass<>(5);
		
		List<Integer> data = Arrays.asList(10,20,30,40,50);
		
		List<Integer> rev =generic.revers(data);
		
		System.out.println(rev);
		
		
	}

}
