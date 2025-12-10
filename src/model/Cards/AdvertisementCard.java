package model.Cards;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class AdvertisementCard extends messageCard {

	/**
	 * <b>constructor</b> : It constructs a new AdvertisementCard Card.
	 * @param message :Is the message the card shows.
	 * @param ImageUrl : The url of the image.
	 * postcondition: It creates a new  advertisent Card ,which has the message it prints, and its url.The money cost is 0.
	 */
	public AdvertisementCard(int money, String message, String ImageUrl) {
		super(money, message, ImageUrl);
	
	}

	/**
	 * this method is responsible for adding the advertisement's card sell money into the player's p1 money
	 * postcondition:the player's p1 money are now bigger by 2-euros
	 * @param p1 is the player who drew the card
	 */
	public void ActivityOfCard(Player p1) {
		p1.setLefta(this.getMoney());
	}
}
