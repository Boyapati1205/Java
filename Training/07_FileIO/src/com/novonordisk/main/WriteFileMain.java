package com.novonordisk.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileMain {
	public static void main(String[] args) {
		String path = "c:/FileIO/write.txt";

		File file = new File(path);

		try {
			FileWriter fileWriter = new FileWriter(file, true);
			fileWriter.write("This is test data");
			fileWriter.close();
			System.out.println("Please chek your file.");
		} catch (IOException e) {
			System.out.println("Filed to locate  file OR You do not have permission to write");
		}

	}
}
