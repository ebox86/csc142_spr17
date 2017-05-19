import java.awt.Color;
import java.util.Scanner;


public class SensorArray {

	// ~~ attributes ~~ //
	
	private static ColorSensor[] csArr;
	private static String date;
	
	// ~~ constructor ~~ //
	
	/**
	 * Constructs default SensorArray object with a provided value from an input file
	 * @param source -- input file
	 */
	public SensorArray(Scanner source){
		load(source);
	}
	
	// ~~ methods ~~ //
	
	/**
	 * Finds the current date of the input file
	 * @return date -- a String of the date
	 */
	public static String getDate(){
		return date;
	}
	
	/**
	 * Finds the longest ColorSensor with the longest time, returns it
	 * @return maxTime -- a ColorSensor object
	 */
	public static ColorSensor longest(){
		ColorSensor maxTime = csArr[0];
		for(int i = 1; i < csArr.length; i++){
			if(csArr[i].getTime() > maxTime.getTime()){
				maxTime = csArr[i];
			}
		}
		return maxTime;
	}
	
	/**
	 * Finds the time deltas between ColorSensors
	 * @return diff -- an int array of the deltas between each time value of each ColorSensor
	 */
	public static int[] timeChange(){
		int[] diff = null;
		for(int i = 0; i < csArr.length - 1; i++){
			int d1 = csArr[i].getTime();
			int d2 = csArr[i + 1].getTime();
			diff[i] = Math.abs(d1 - d2);
		}
		return diff;
	}
	
	/**
	 * Finds the two ColorSensors with the closest brightness ratings, returns them as an array.
	 * @return closeArr -- Returns an array of the closest two brightness values in the ColorSensor array
	 */
	public static ColorSensor[] getClosest(){
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
	
	/**
	 * Loads a new data file and stores each ColorSensor into array
	 * @param source -- the scanner used for file input
	 */
	public static void load(Scanner source){
		csArr = null;
		int line = 0;
		System.out.println(source.toString());
		while (source.hasNext()){
			System.out.println("loop");
            String s = source.nextLine();
            if(line < 1){
            	date = s;
            } else {
	            String[] lineData = s.split("\\s");
	            Color c = new Color(Integer.parseInt(lineData[1]), Integer.parseInt(lineData[2]), Integer.parseInt(lineData[3]));
	            ColorSensor cs = new ColorSensor(lineData[0], c, Integer.parseInt(lineData[4]));
	            System.out.println(s.toString());
	            csArr[line - 1] = cs;
            }
            line++;
		}
		source.close();
	}
	
	/**
	 * Returns a ColorSensor object based on a provided name
	 * @param name -- the name of the sensor to return
	 * @return cs -- ColorSensor object based on the provided name
	 */
	public static ColorSensor findSensor(String name){
		ColorSensor cs = null;
		for(int i = 0; i < csArr.length; i++){
			if(csArr[i].getName() == name){
				cs = csArr[i];
			}
		}
		return cs;
	}
	
	/**
	 * toString method which returns string of all ColorSensors
	 */
	public String toString(){
		StringBuilder sb = new StringBuilder();
		for(ColorSensor n : csArr){
			sb.append(n.toString() + "\n");
		}
		return sb.toString();
	}
}
