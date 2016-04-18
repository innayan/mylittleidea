import com.sun.javafx.runtime.VersionInfo;

import colors.Color;

/**
 * Test class for unused import code inspection warnings
 */
public class UnusedImportTest {

	public static void main(String[] args) {
		System.out.println("Running with JavaFX runtime version " + VersionInfo.getRuntimeVersion());

		doSomethingWithColor();
	}

	private static void doSomethingWithColor() {
		System.out.println(Color.RED);
		System.out.println(Color.GREEN);
		System.out.println(Color.BLUE);
	}

}
