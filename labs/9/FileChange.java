import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//Sam Alcosser
//4-24-19
public class FileChange {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		if(args.length != 2) {
			System.out.println("usage: content to delete, file name ");
			System.exit(1);
		}
		//taking the file in from the arguments in the command line, this was made to be accessed from the command line
		File inFile = new File(args[1]);
		File outFile = new File("Temp.txt");		//creating a holding file
		PrintWriter pw = new PrintWriter(outFile);	//making a printwriter that will write the new file
		Scanner input = new Scanner(inFile);
		while(input.hasNext()) {
			String line = input.nextLine();
			pw.println(line.replaceAll(args[0], ""));
		}
		inFile.delete();
		outFile.renameTo(inFile);
		System.out.println("complete. Find your new file at " + args[1]);
	}
	
}
