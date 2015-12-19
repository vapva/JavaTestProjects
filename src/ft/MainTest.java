package ft;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.net.URISyntaxException;

public class MainTest {

	public static void main(String[] args) throws URISyntaxException {
		File workFile = new File(".." /*+ File.separator*//*+"FilesTest"*/);
		File currentFile = new File(MainTest.class.getProtectionDomain().
				getCodeSource().getLocation().toURI().getPath());
		System.out.println(currentFile.getName());
		System.out.println(workFile.getAbsolutePath());
		System.out.println("isDirectory: "+ workFile.isDirectory());
		try {
			System.out.println(workFile.getCanonicalPath());
			File[] availableFiles = workFile.listFiles(new FilenameFilter() {
				@Override
				public boolean accept(File dir, String name) {
					return true;
				}
			});
			for (File file : availableFiles) {
				System.out.println(file.getName());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-----------------------------");
		String s=System.in.toString();
		System.out.println(s);
	}

}
