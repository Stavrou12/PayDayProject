package model.Position;

import model.Jackpot.Jackpot;
import model.Player.Player;

public class FamilyPos extends Position {

	/**
	 * <b>constructor</b> constructs a new 	FamilyPos Position
	 * @param numofps is the number of the position 
	 * @param ImageUrl is the images's url path
	 * precondition : numofpos must be between 1 and 30 and the numofpos is not taken by the opponent.
	 */
	public FamilyPos(int numofps, String ImageUrl) {
		super(numofps, ImageUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * <b>transformer</b> this method makes some action depending on the player's number of zari ,that made him go to this position
	 * if(num mod 2 == 0 ) the player receives +500 else gives 500to the jackpot
	 * @param p1 represents the player that now is on this position
	 * @param jack jackpot
	 * postcondition:the money of the player changes.
	 * @return true if the player won the jackpot else false
	 */
	public boolean ActivityOfPos(Player p1,Jackpot jack) {
		boolean yeah ;
		yeah =false;
	    int money=500;
		if( (p1.getZari().getNumZari()) % 2 == 0 ) 
		{
			p1.setLefta(money);
			yeah = true;
		}else 
		{
			 if (p1.getLefta() < money) 
			 {
	             p1.setLoan(money - p1.getLefta());
	             p1.setLefta( -p1.getLefta());
	            } else
	            {
	              p1.setLefta(-money);
	            }
	         jack.setJackVal(money);
		}
		return yeah;
	}
}
