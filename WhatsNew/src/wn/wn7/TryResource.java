package wn.wn7;

import java.io.File;
import java.io.FileOutputStream;

public class TryResource {

	public void doIt() {
		try (AutoCloseableCustomResources autoCloseableCustomResources = new AutoCloseableCustomResources();
				FileOutputStream fos = new FileOutputStream(new File("C:\\Work\\WhatsNew7\\new.txt"))) {
			// código para procesar fos
			
			autoCloseableCustomResources.doSomething();
		} catch (Exception ex) {
			System.out.println(ex);
		}
	}
}
