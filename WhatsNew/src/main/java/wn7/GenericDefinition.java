package wn.wn7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericDefinition {

	public void doIt() {

		// Java 6
		Map<String, List<String>> anagrama = new HashMap<String, List<String>>();

		// Java 7
		Map<String, List<String>> anagrama2 = new HashMap<>();
		
		System.out.println(anagrama);
		System.out.println(anagrama2);
	}
}