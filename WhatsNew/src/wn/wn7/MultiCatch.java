package wn.wn7;

public class MultiCatch {

	public void doIt () {
		try {
		    int v = Integer.parseInt("");
		    int result = 100 / v;
		    System.out.println(result);
		} catch(NumberFormatException | ArithmeticException ex ) {
		    System.out.println("Not a valid number or zero");
		}
	}
	

}
