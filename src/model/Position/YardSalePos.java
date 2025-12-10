package model.Position;

import model.Cards.DealCard;
import model.Jackpot.Jackpot;
import model.Player.Player;

public class YardSalePos extends Position {

	/**
	 * <b>constructor</b> constructs a new 	FamilyPos Position
	 * @param numofps is the number of the position 
	 * @param ImageUrl is the images's url path
	 * precondition : numofpos must be between 1 and 30 and the numofpos is not taken by the opponent.
	 */
	public YardSalePos(int numofps, String ImageUrl) {
		super(numofps, ImageUrl);
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * <b>transformer</b>
	 * this method does the following action:the player rolls the dice again,pays 100*num of dice and then gets a dealcard without paying.
	 * @param p1 player on the position
	 * @param num number of the dice
	 * @param card the DealCard card
	 */
    public void ActivityOfPos(Player p1,int num,DealCard card) {
    	int var = 100;
		if (num * var > p1.getLefta())
		{
			p1.setLoan(num * var - p1.getLefta());
			p1.setLefta(-p1.getLefta());
		} else
		{
			p1.setLefta(-num * var);
		}
		p1.keepDealCard(card);  //pairnei thn prwth karta pou brisketai sthn stoiva twn deal cards xwris na plhrvsei
	}

}
