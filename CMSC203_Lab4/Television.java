/** 
* The purpose of this class is to model a television
* @author LapChan
* @version 9/29
*/

public class Television {
	private final int SCREEN_SIZE; //size of the tv screen
	private int channel=2;			// what channel the tv is set to 
	private int volume=20;				// tv's volume
	private final String MANUFACTURER;	//the brand of the tv
	private	Boolean powerOn=false;			// is the tv on
	
	/**
	 *  initialize the manufacture and screen size variable to the parameter given
	 * @param brand Tv's manufacturer
	 * @param size	Tv's size
	 */
	public Television(String brand, int size) {
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
	}
	
	/**
	 * @param station 		The station Tv is set to
	 */
	public void setChannel(int station) {
		this.channel=station;
	}
	
	/**
	 * switch the power
	 */
	public void power() {
		this.powerOn=!this.powerOn;
	}
	
	/**
	 * increase the volume
	 */
	public void increaseVolume() {		
		this.volume++;
	}
	
	/**
	 * decrease the volume
	 */
	public void decreaseVolume() {
		if(this.volume>0)
		this.volume--;
	}
	
	/**
	 * @return the channel of the Television object
	 */
	public int getChannel() {
		return this.channel;
	}
	/**
	 * @return  the volume of the Television object
	 */
	public int getVolume() {
		return this.volume;
	}
	/**
	 * @return  the brand of the Television object
	 */
	public String getManufacturer() {
		return this.MANUFACTURER;
	}
	/**
	 * @return  the screen size of the Television object
	 */
	public int getScreenSize() {
		return this.SCREEN_SIZE;
	}
	
}
