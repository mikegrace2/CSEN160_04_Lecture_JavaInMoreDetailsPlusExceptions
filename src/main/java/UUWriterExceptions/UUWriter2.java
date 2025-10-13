package UUWriterExceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import javax.swing.ImageIcon;

public class UUWriter2 {
	public static void main(String[] args) {
		Path p=Path.of("uuids.txt");
		
		try {
			ImageIcon myImage=new ImageIcon("Hello.txt");
			Files.writeString(p, "1234567890", StandardOpenOption.APPEND);
		} catch (IOException e) {}
	}
}