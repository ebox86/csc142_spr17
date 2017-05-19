import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class SensorApp {

	private static SensorArray sensorArr;
	
	public static void main(String[] args){
		System.out.println("\nWelcome to the Physics Departments SensorApp\n"
				+ "=============================================\n");

		Scanner in = new Scanner(System.in);
		boolean valFlag = true;
		while(valFlag){
			try {
				System.out.print("Please enter name of input datafile to be read :> ");
				String file1 = in.next();
				sensorArr = fileInput(file1);
				valFlag = false;
			} catch (FileNotFoundException e) {
				System.out.println("File Not Found! Please enter valid input file name.\n");
			}
		}
		System.out.print("Please enter name of output datafile to be written :> ");
		String file2 = in.next();
		System.out.print(sensorArr.toString());
	}
	
	private static SensorArray fileInput(String filename) throws FileNotFoundException {
		Scanner input = new Scanner(new File("C:\\Users\\ebox8_000\\workspace\\csc142_spr17\\Homework\\" + filename));
		SensorArray data = new SensorArray(input);
		return data;
	}
}
