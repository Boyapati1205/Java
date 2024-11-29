package com.novonordisk.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

public class ReadFileMain {
	public static void main(String[] args) {
		String path = "c:/FileIO/User.txt";
		File file = new File(path);
		char[] data;

		try {
			int length = (int) file.length();
			data = new char[length];
			FileReader reader = new FileReader(file);
			reader.read(data);
			reader.close();
			System.out.println("Read Operation completed Successfully");
			for (char d : data) {
				System.out.print(d);
			}

		} catch (FileNotFoundException e) {
			System.out.println("Invalid File Path");
		} catch (IOException e) {
			System.out.println("File IO operation is in process");

		}
	}
}
