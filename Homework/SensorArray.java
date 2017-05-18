import java.awt.Color;
import java.util.Scanner;


public class SensorArray {

	// ~~ attributes ~~ //
	
	ColorSensor[] csArr;
	String date;
	
	// ~~ constructor ~~ //
	
	public SensorArray(Scanner source){
		int line = 0;
		while (source.hasNext()){
            String s = source.next();
            if(line < 1){
            	this.date = s;
            }
            String[] lineData = s.split("\\t");
            Color c = new Color(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]), Integer.parseInt(lineData[3]));
            ColorSensor cs = new ColorSensor(lineData[0], c, Integer.parseInt(lineData[4]));
            csArr[line] = cs;
            line++;
		}
	}
}
