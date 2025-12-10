package model.Zari;

/**
 * 
 * @author gnnss
 *
 */
public class Zari {

	private int numzari;
	private boolean rolled;
	
	/**
	 * <b>constructor</b> Initializes the values of numazari (number of dice)=0, and rolled== if the dice has rolled ==false.
	 * postcondition : it creates a new Zari with the initial values of its variables are:numzari = 0 and rolled = false.
	 * numzari indicates the number of the dice and rolled indicates the state if the dice has stopped rolling or not
	 */
	public Zari() {
        numzari= 0;
        rolled= false;
    }
	
	/**
	 * <b>accessor</b>
	 * @return numzari(the number of the dice)
	 */
	public int getNumZari() {
		return numzari;
	}
	
	/**
	 * <b>transformer</b> :this method generates a random int from 1 to 6.
	 * postcondition : the number that returns is  numzari .(1-6)
	 * @return the number of the zari
	 */
	public int rollDice() {
		int generatenum;
		generatenum = 1 + (int)(Math.random() * ((6 - 1) + 1));
		rolled = true;
		numzari = generatenum;
		return generatenum;
		
	}
	
	/**
	 * <b>transformer</b>
	 * makes the rolled value equal to variable roll.(true or false)
	 * @param roll it sets the var rolled to roll
	 */
	public void setRoll(boolean roll) {
		rolled = roll;
	}
	
	/**
	 * <b>observer</b>
	 * @return the value of rolled variable
	 */
	public boolean getRoll() {
		return rolled;
		
    }
}
