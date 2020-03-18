package wn;

import wn.wn7.MenuJava7;
import wn.wn8.MenuJava8;

public class Main {

	public static void main(String[] args) {

		String javaVersion = "";
		String optionSelected = "";

		switch (javaVersion) {
		case "7":
			MenuJava7.menu(optionSelected);
			break;
		case "8":
			MenuJava8.menu(optionSelected);
			break;
		case "9":

			break;

		default:
			break;
		}

	}

}
