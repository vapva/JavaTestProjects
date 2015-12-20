package ft;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

public class MainTest {

	public static void main(String[] args)  {
		
		String currentPath = null;
		try {
			currentPath = MainTest.class.getProtectionDomain().
					getCodeSource().getLocation().toURI().getPath()/*.getFile().intern()*/;
		} catch (URISyntaxException e1) {
			System.out.println("Wrong Path!");
			System.exit(0);
		}
		if (!currentPath.contains("maintest.jar")) {
			System.out.println("Application's file name is chaged, termination ...");
			System.exit(0);
		}

		File workFile = new File("." /*+ File.separator*//*+"FilesTest"*/);

		try {
			System.out.println("Processed folder: " +workFile.getAbsolutePath());
			System.out.println("CanonicalPath: " +workFile.getCanonicalPath());
			System.out.println("isDirectory: "+ workFile.isDirectory());
			System.out.println("CanonicalPath: " +workFile.getCanonicalPath());
			System.out.println("-----------------------------");
			File[] availableFiles = workFile.listFiles();
			for (File file : availableFiles) {
				System.out.println(file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------");
/*		String s=System.in.toString();
		System.out.println(s);*/
	}

}
