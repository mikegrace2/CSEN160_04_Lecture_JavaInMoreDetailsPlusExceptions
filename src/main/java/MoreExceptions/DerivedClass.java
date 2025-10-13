package MoreExceptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class DerivedClass implements InterfaceWithException{
	@Override
	public void printScreen() {
		return;	
	}
	
	public void openFile() throws FileNotFoundException, IOException, InterruptedException {
		// code
	}
}