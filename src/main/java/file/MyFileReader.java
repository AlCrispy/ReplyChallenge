package file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileReader {

 	
	public static StringBuilder readFile(String file) throws Exception {
		BufferedReader br = null;
		FileReader fr = null;
		StringBuilder sb = new StringBuilder();
		fr = new FileReader(file);
		br = new BufferedReader(fr);
		String sCurrentLine;
		while ((sCurrentLine = br.readLine()) != null) {
			sb.append(sCurrentLine);
			System.out.println(sCurrentLine);
		}
		return sb;
	}

}
