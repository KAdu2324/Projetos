import java.util.ArrayList;
import java.util.List;

public class Estudo {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("maria");
		list.add("joao");
		list.add("carlos");
		list.add("valdir");
		list.add("ana");
		
		System.out.println(list.size());
		
		
		for(String x : list) {
			System.out.println(x);
		}
		
	}
	
}


