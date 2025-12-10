package model.Cards;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class GetMoneyFromNeigh extends messageCard {

	/**
	 * <b>constructor</b> : It constructs a new GetMoneyFromNeigh Card.
	 * @param money    :It depicts the money that the card costs.
	 * @param message  :Is the message the card shows.
	 * @param ImageUrl :The url of the image.
	 * postcondition: It creates a new GetMoneyFromNeigh Card ,which has the money it costs,the message it prints, and its url.
	 */
	public GetMoneyFromNeigh(int money, String message, String ImageUrl) {
		super(money, message, ImageUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param p1
	 * postcondition:the oppenent player must pay p1 player ,with the money theGetMoneyFromNeigh shows.So it transfers the money 
	 */
	@Override
	public void ActivityOfCard(Player p1) {
		// TODO Auto-generated method stub
		 if(this.getMoney() > p1.getOpponent().getLefta())
		 {
           p1.getOpponent().setLoan( this.getMoney() - p1.getOpponent().getLefta() );
           p1.getOpponent().setLefta( this.getMoney() - p1.getOpponent().getLefta() );
         }
		 
         p1.getOpponent().setLefta( -this.getMoney() );
         p1.setLefta(this.getMoney());
		 
	}

}
