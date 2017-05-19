import java.awt.Color;
import java.util.Scanner;


public class SensorArray {

	// ~~ attributes ~~ //
	
	private static ColorSensor[] csArr;
	private static String date;
	
	// ~~ constructor ~~ //
	
	public SensorArray(Scanner source){
		load(source);
	}
	
	// ~~ methods ~~ //
	
	public String getDate(){
		return this.date;
	}
	
	public ColorSensor longest(){
		ColorSensor maxTime = csArr[0];
		for(int i = 1; i < csArr.length; i++){
			if(csArr[i].getTime() > maxTime.getTime()){
				maxTime = csArr[i];
			}
		}
		return maxTime;
	}
	
	public int[] timeChange(){
		int[] diff = null;
		for(int i = 0; i < csArr.length - 1; i++){
			int d1 = csArr[i].getTime();
			int d2 = csArr[i + 1].getTime();
			diff[i] = Math.abs(d1 - d2);
		}
		return diff;
	}
	
	public ColorSensor[] getClosest(){
		ColorSensor[] closeArr = null;
		double testVal = csArr[0].getBrightness() - csArr[1].getBrightness();
		for(int i = 0; i < csArr.length; i++){
			for(int j = 0; j < csArr.length; j++){
				if(Math.abs(csArr[i].getBrightness() - csArr[j].getBrightness()) < testVal){
					closeArr[0] = csArr[i];
					closeArr[1] = csArr[j];
				}
			}
		}
		return closeArr;
	}
	
	public static void load(Scanner source){
		int line = 0;
		while (source.hasNext()){
            String s = source.next();
            if(line < 1){
            	date = s;
            }
            String[] lineData = s.split("\\t");
            Color c = new Color(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]), Integer.parseInt(lineData[3]));
            ColorSensor cs = new ColorSensor(lineData[0], c, Integer.parseInt(lineData[4]));
            csArr[line] = cs;
            line++;
		}
	}
	
	public ColorSensor findSensor(String name){
		ColorSensor cs = null;
		for(int i = 0; i < csArr.length; i++){
			if(csArr[i].getName() == name){
				cs = csArr[i];
			}
		}
		return cs;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(ColorSensor n : csArr){
			sb.append(n.toString() + "\n");
		}
		return sb.toString();
	}
}
