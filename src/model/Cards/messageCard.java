package model.Cards;
import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public abstract class messageCard extends Card {

	/**
	 * <b>constructor</b> : It constructs a new messageCard Card.
	 * @param money    :It depicts the money that the card costs.
	 * @param message  :Is the message the card shows.
	 * @param ImageUrl :The url of the image.
	 * postcondition: It creates a new message Card ,which has the money it costs,the message it prints, and its url.
	 */
	public messageCard(int money,String message,String ImageUrl) {
		super(money,message,ImageUrl);
	}
	/**
	 * this function will set some activities of the player that the card demands,in other inherited classes.
	 * @param p1 the player that draws the card
	 */
	@Override
	public void ActivityOfCard(Player p1) {}
}
