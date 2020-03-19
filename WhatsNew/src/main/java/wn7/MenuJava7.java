package wn.wn7;

import wn.wn7.GenericDefinition;
import wn.wn7.MultiCatch;
import wn.wn7.NumericFormats;
import wn.wn7.StringSwitch;
import wn.wn7.TryResource;

public class MenuJava7 {

	public static void menu(String optionSelected) {

		switch (optionSelected) {
		case "1":
			MultiCatch multiCatch = new MultiCatch();
			multiCatch.doIt();
			break;
		case "2":
			NumericFormats numericFormats = new NumericFormats();
			numericFormats.doIt();
			break;
		case "3":
			StringSwitch stringSwitch = new StringSwitch();
			stringSwitch.doIt();
			break;
		case "4":
			TryResource tryResource = new TryResource();
			tryResource.doIt();
			break;
		case "5":
			GenericDefinition genericDefinition = new GenericDefinition();
			genericDefinition.doIt();
			break;
		}
	}

}
