package UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class UUWriter3 {

	public static void main(String[] args) throws IOException {
		Path p=Path.of("uuids.txt");
		
		Files.writeString(p, "1234567890", StandardOpenOption.APPEND);
	}
}
