import java.awt.Color;

/**
 * ColorSensor object used to create new objects for the physics department equipment
 * @author ebox8_000
 *
 */
public class ColorSensor {

	// ~~ attributes ~~ //
	private Color c;
	private String sensorName;
	private int time;
	
	// ~~ constructor ~~ //
	
	/**
	 * Default constructor used to build a ColorSensor object
	 * @param sensorName -- the name of the sensor 
	 * @param c -- color value to be used
	 * @param time -- time to be set
	 * @throws IllegalArgumentException -- if time is less than zero
	 * @throws NullPointerException -- if Sensor name or Color values are not passed or are null
	 */
	public ColorSensor(String sensorName, Color c, int time) throws IllegalArgumentException, NullPointerException {
		if(time <= 0){
			throw new IllegalArgumentException();
		}
		if(sensorName == null || c == null){
			throw new NullPointerException();
		}
		
		this.sensorName = sensorName;
		this.c = c;
		this.time = time;
		
	}
	
	// ~~ accessors ~~ //
	
	/**
	 * Gets time for this ColorSensor object
	 * @return -- the current time set of the object
	 */
	public int getTime(){
		return this.time;
	}
	
	/**
	 * The name of the sensor for the ColorSensor object
	 * @return -- the name of the sensor
	 */
	public String getName(){
		return this.sensorName;
	}
	
	/**
	 * Sets the brightness of the ColorSensor object based on a formula from the Color values currently set
	 * @return -- the brightness value as a double
	 */
	public double getBrightness(){
		return Math.sqrt((0.241 * Math.pow(this.c.getRed(), 2)) + (0.691 * Math.pow(this.c.getGreen(), 2)) + (0.068 * Math.pow(this.c.getBlue(), 2)) );
	}
	
	// ~~ mutators ~~ //
	
	/**
	 * Sets the color of the ColorSensor object
	 * @param c -- the Color object to set this ColorSensor object
	 * @throws NullPointerException -- if c is null
	 */
	public void setColor(Color c) throws NullPointerException{
		if(c == null){
			throw new NullPointerException();
		}
		this.c = c;
	}
	
	/**
	 * Sets seconds for the ColorSensor object
	 * @param s -- the input time that is to be set
	 * @throws IllegalArgumentException -- if time is less than 0
	 */
	public void setSeconds(int s) throws IllegalArgumentException{
		if(time <= 0){
			throw new IllegalArgumentException();
		}
		this.time = s;
	}
	
	// ~~ methods ~~ //
	
	/**
	 * toString method to return the current data stored in the ColorSensor object
	 */
	public String toString(){
		return String.format("%s (%d, %d, %d):%d", this.sensorName, this.c.getRed(), this.c.getGreen(), this.c.getBlue(), this.time);
	}
	
}
