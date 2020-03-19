package wn.wn7;

public class NumericFormats {

	public void doIt() {
		
		int n = 0b10000000;
		System.out.println(n);  // imprime 128
		 
		int n2 =  121_31_23_232;   // literal entero con subrayados
		System.out.println(n2);
		
		int n3 =  0xff_dd;   // liberal hexadecimal con subrayados
		System.out.println(n3);
	}
}
