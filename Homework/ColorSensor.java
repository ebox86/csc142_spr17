import java.awt.Color;

public class ColorSensor {

	// ~~ attributes ~~ //
	private Color c;
	private String sensorName;
	private int time;
	
	// ~~ constructor ~~ //
	
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
	
	public int getTime(){
		return this.time;
	}
	
	public String getName(){
		return this.sensorName;
	}
	
	public double getBrightness(){
		return Math.sqrt((0.241 * Math.pow(this.c.getRed(), 2)) + (0.691 * Math.pow(this.c.getGreen(), 2)) + (0.068 * Math.pow(this.c.getBlue(), 2)) );
	}
	
	// ~~ mutators ~~ //
	
	public void setColor(Color c) throws NullPointerException{
		if(c == null){
			throw new NullPointerException();
		}
		this.c = c;
	}
	
	public void setSeconds(int s) throws IllegalArgumentException{
		if(time <= 0){
			throw new IllegalArgumentException();
		}
		this.time = s;
	}
	
	// ~~ methods ~~ //
	
	public String toString(){
		return String.format("%s (%d, %d, %d):%d", this.sensorName, this.c.getRed(), this.c.getGreen(), this.c.getBlue(), this.time);
	}
	
}
