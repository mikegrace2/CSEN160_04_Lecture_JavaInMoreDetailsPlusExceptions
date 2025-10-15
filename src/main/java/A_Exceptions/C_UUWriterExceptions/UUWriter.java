package A_Exceptions.C_UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class UUWriter {
	public static void main(String[] args) throws IOException {
		Files.writeString(Path.of("uuids.txt"), UUID.randomUUID()+"\n", StandardOpenOption.APPEND);
	}
}