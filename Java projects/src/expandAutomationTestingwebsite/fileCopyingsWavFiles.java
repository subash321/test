package expandAutomationTestingwebsite;
import java.io.*;
import java.util.Scanner;

public class fileCopyingsWavFiles {
	public static void main(String[] args) throws Exception {		
		readFile();
	}
 
	public static void readFile() throws Exception {
 
		// Location of file to read
		File file = new File("E:\\wavfiles\\Test 1_01.wav");
 
		Scanner scanner = new Scanner(file);
 
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			//System.out.println(line);
			writeFile(line);
		}
		scanner.close();
		System.out.println("File Copied"); 
	}
 
	public static void writeFile(String copyText) throws Exception {
 
		for(int fileName=251; fileName<=500; fileName++){
		String newLine = System.getProperty("line.separator");
 
		// Location of file to output
	    Writer output = null;
	    File file = new File("E:\\wavfiles\\Test 1_"+fileName+".wav");
	    output = new BufferedWriter(new FileWriter(file, true));
	    output.write(copyText);
	    output.write(newLine);
	    output.close();
		}
	}
 
}

