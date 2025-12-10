package model.Cards;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public abstract class Card {
	private final int money;
	private final String message;
	private final String ImageUrl;

	/**
	 * <b>constructor</b> : It constructs a new Card.
	 * @param money    :It depicts the money that the card costs.
	 * @param message  :Is the message the card shows.
	 * @param ImageUrl :The url of the image.
	 * postcondition : It creates a new Card ,which has the money it costs,the message it prints and its url.
	 */
	public Card(int money, String message, String ImageUrl) {
		
		
		this.money = money;
		this.message = message;
		this.ImageUrl = ImageUrl;
	}
	
   /**
    * <b>accessor</b>
    * @return how much the card costs
    */
	
	public int getMoney() {
		return money;
	}
	
	/**
	 * <b>accessor</b>
	 * @return the message the Card prints
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <b>accessor</b>
	 * @return the path of the image(where it is located)
	 */
	public String getImageUrl() {
		return ImageUrl;
	}
	
	/**
	 * this function will set some activities of the player that the card demands,in other inherited classes.
	 * @param p1 the player that drew the card.
	 */
	public abstract void ActivityOfCard(Player p1);
}
