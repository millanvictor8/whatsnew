package wn.wn7;

public class AutoCloseableCustomResources implements AutoCloseable {

	public AutoCloseableCustomResources() {
			System.out.println("Constructor -> AutoCloseableResources");
	}

	public void doSomething() {
		System.out.println("Something -> AutoCloseableResources");
	}

	@Override
	public void close() throws Exception {
		System.out.println("Close -> AutoCloseableResources");
	}
}