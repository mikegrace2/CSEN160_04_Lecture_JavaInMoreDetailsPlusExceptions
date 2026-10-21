package A_Exceptions.C_UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;
import java.nio.file.*;

public class UUWriter {
	public static void main(String[] args) {
		try {
			Files.writeString(Path.of("uuids.txt"), UUID.randomUUID()+"\n", StandardOpenOption.APPEND);
		} catch (NoSuchFileException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}