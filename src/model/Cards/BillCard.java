package model.Cards;
import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class BillCard extends messageCard {
	/**
	 * <b>constructor</b> : It constructs a BillCard card.
	 * @param money : It depicts the money that the card costs.
	 * @param message : Is the message the card shows.
	 * @param ImageUrl : The url of the image.
	 * postcondition:It creates a BillCard card with the money it costs,the message it prints, and its url.
	 */
	public BillCard(int money,String message,String ImageUrl) {
		super(money,message,ImageUrl);
	}

	/**
	 * this method adds to the player's logariasmoi the money of the billcard card
	 * 
	 * postcondition :logariasmoi variable is now bigger than the old one.
	 * @param p1 is the player who drew the card.
	 */
	@Override
	public void ActivityOfCard(Player p1) {
		// TODO Auto-generated method stub
		p1.setBill(this.getMoney());
		
	}

}