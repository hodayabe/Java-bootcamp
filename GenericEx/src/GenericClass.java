import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenericClass<T> implements GenericInterface<T>{
	private T t;

	public GenericClass(T t) {
		this.t = t;
	}

	@Override
	public List<T> revers(List<T> t) {
		List<T> temp=new ArrayList<T>(t);
		Collections.reverse(temp);
		return temp;
	}

	@Override
	public String toString() {
		return "GenericClass [t=" + t + "]";
	}
	
	
	

}
