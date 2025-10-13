package MoreExceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoCatch {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("NoWay.txt");
		BufferedReader in = new BufferedReader(reader);
		
		try {
			in.read();
		}finally {
			in.close();
		}
	}
}