package wn.wn7;

public class StringSwitch {

	//case sensitive
	public void doIt() {
		
		String key = "aaa";
		switch (key) {
		case "AAA":
			System.out.println("AAA");
			break;
		case "aaa":
			System.out.println("aaa");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
