package model.Cards;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class PayTheNeigh extends messageCard {

	/**
	 * <b>constructor</b> : It constructs a newPayTheNeigh Card.
	 * @param money    :It depicts the money that the card costs.
	 * @param message  :Is the message the card shows.
	 * @param ImageUrl :The url of the image.
	 * precondition:money must be > 0 and the image url should depict a correct path.
	 * postcondition : It creates a new PayTheNeigh Card ,which has the money it costs,the message it prints, and its url.
	 */
	public PayTheNeigh(int money, String message, String ImageUrl) {
		super(money, message, ImageUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * this method forces p1 to pay the opponent player with the money the card depicts.If he has not enough money p1 gets a loan.
	 * @param p1
	 * postcondition: money transfer between p1 and opponent player.
	 */
	@Override
	public void ActivityOfCard(Player p1) {
		// TODO Auto-generated method stub
		if( this.getMoney() > p1.getLefta()) 
		{
			 p1.setLoan( this.getMoney() - p1.getLefta() );
	         p1.setLefta( this.getMoney() - p1.getLefta() );
		}
		
		p1.setLefta( -this.getMoney() );
        p1.getOpponent().setLefta(this.getMoney());
	}

}
