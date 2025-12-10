package model.Jackpot;

/**
 * 
 * @author gnnss
 *
 */
public class Jackpot {

	private int jackval;
	
	/**
	 * <b>constructor</b> it constructs a new  Jackpot 
	 * postcondition: it sets the jackval variable equal to zero.
	 */
	public Jackpot() {
		this.jackval=0;
	}
	
	/**
	 * <b>transformer</b>
	 * This method ensures that if one player wins the jackpot takes the money(jackval) from it,the jackval will be set 0 again.
	 * postcondition: the jackval value will be 0 after this funct.
	 * @return the jackval variable
	 */
	public int WinAndClearJack() {
		int tmpjack;
		tmpjack= jackval;
		jackval = 0 ;
		return tmpjack;
		
	}
	
	/**
	 * <b>transformer</b> 
	 * This method adds or removes money to the jackpot.
	 * @param money represent the additional money that will be added to the jackpot.
	 */
	public void setJackVal(int money) {
	
		jackval=jackval+money;
	}
	
	/**
	 * <b>accessor</b>
	 * @return jackval value(jackpot money)
	 */
	public int getJackVal() {
		return jackval;
	}
	
	/**
	 * <b>accessor</b> this method returns the jackval value in a string
	 * @return jackval (the money of jackpot)
	 */
	public String toString() {
		return jackval+"";
		
	}
}
