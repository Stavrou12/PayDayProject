package model.Cards;

import model.Player.Player;
import model.Position.BuyerPosition;
import model.Position.Position;
import model.Position.DealPosition;

/**
 * 
 * @author gnnss
 *
 */
public class moveToBuyerOrDeal extends messageCard {

	/**
	 * <b>constructor</b> : It constructs a new moveToBuyerOrDeal  Card.
	 * @param message :Is the message the card shows.
	 * @param ImageUrl : The url of the image.
	 * postcondition: It creates a new moveToBuyerOrDeal Card ,which has the message it prints, and its url.The money cost is 0 as does not pay any fine.
	 */
	public moveToBuyerOrDeal( String message, String ImageUrl) {
		super(0, message, ImageUrl);
		// TODO Auto-generated constructor stub
	}
    
	/**
	 * 
	 * @param p1 is the player that draws the moveToBuyerOrDeal card 
	 * @param pinakas is an array that has the positions of the board
	 * postcondition: it returns the number the player p1 should move to depending on if there is a deal or buyer position.Else returns the current position .
	 */
	public int ActivityOfCard(Player p1,Position pinakas[]) {
		// TODO Auto-generated method stub
		for( int thesi = p1.getPos() ; thesi < pinakas.length ; thesi++) 
		{
		   if( (pinakas[thesi] instanceof BuyerPosition) ) {
			   return thesi;
		   }
		    if((pinakas[thesi] instanceof DealPosition) )  {
                return thesi;
            }
		}
		  return p1.getPos();
	}

}
