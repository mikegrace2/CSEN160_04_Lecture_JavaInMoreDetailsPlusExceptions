package A_Exceptions.C_UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UUWriter4 {
	public static void main(String[] args) {
		Path p = Path.of("uuids.txt");

		try {
			Files.writeString(p, "1234567890", StandardOpenOption.APPEND);
		} catch (IOException e) {
			System.out.println("IOException!");
		} /*catch (NoSuchFileException e) { // This is unreachable code because NoSuchFileException is a subclass of IOException
			System.out.println("IOException!");
		}*/
	}
}