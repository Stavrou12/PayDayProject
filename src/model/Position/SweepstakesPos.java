package model.Position;

import model.Jackpot.Jackpot;
import model.Player.Player;

public class SweepstakesPos extends Position {

	/**
	 * <b>constructor</b> constructs a new 	SweepstakesPos Position
	 * @param numofps is the number of the position 
	 * @param ImageUrl is the images's url path
	 * precondition : numofpos must be between 1 and 30 and the numofpos is not taken by the opponent.
	 */
	public SweepstakesPos(int numofps, String ImageUrl) {
		super(numofps, ImageUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * <b>transformer</b> this method makes some action depending on the player's number of zari 
	 * the player takes 1000* number of arithmos zarias
	 * @param p1 represents the player that now is on this position
	 * @param arithmos dice number
	 * postcondition:the money of the player changes.
	 */
	public void ActivityOfPos(Player p1,int arithmos) {
		 p1.setLefta(arithmos * 1000);
	}
}
