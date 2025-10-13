package UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.UUID;

public class UUWriter1 {
	public static void main(String[] args) {
		try {
			Files.writeString(Path.of("uuids.txt"), UUID.randomUUID()+"\n", StandardOpenOption.APPEND);
		}catch(NullPointerException | NumberFormatException | NoSuchFileException e) {
			System.out.println(""+e.getClass().getName());
			e.printStackTrace();			
		}catch(IOException e) {
			System.out.println(""+e.getMessage());
			e.printStackTrace();			
		}
	}
}
