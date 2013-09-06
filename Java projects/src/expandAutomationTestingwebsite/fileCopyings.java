package expandAutomationTestingwebsite;
import java.io.*;
import java.util.Scanner;

public class fileCopyings {
	public static void main(String[] args) throws Exception {		
		readFile();
	}
 
	public static void readFile() throws Exception {
 
		// Location of file to read
		File file = new File("E:\\ReadFiles.txt");
 
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
 
		for(int a=1; a<=10; a++){
		String newLine = System.getProperty("line.separator");
 
		// Location of file to output
	    Writer output = null;
	    File file = new File("E:\\CopiedFiles"+a+".txt");
	    output = new BufferedWriter(new FileWriter(file, true));
	    output.write(copyText);
	    output.write(newLine);
	    output.close();
		}
	}
 
}

/*import java.io.*;
import java.util.Scanner;
 
public class FileProgram {
 
	public static void main(String[] args) throws Exception {		
		readFile();
	}
 
	public static void readFile() throws Exception {
 
		// Location of file to read
		File file = new File("data.txt");
 
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
 
		String newLine = System.getProperty("line.separator");
 
		// Location of file to output
	    Writer output = null;
	    File file = new File("date_output.txt");
	    output = new BufferedWriter(new FileWriter(file, true));
	    output.write(copyText);
	    output.write(newLine);
	    output.close();		
	}
 
}
*/