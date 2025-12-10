package model.Cards;
import model.Player.Player;
import model.Jackpot.Jackpot;

/**
 * 
 * @author gnnss
 *
 */
public class CharityCard extends messageCard {

	/**
	 * <b>constructor</b> : It constructs a new CharityCard Card.
	 * @param money : It depicts the money that the card costs.
	 * @param message :Is the message the card shows.
	 * @param ImageUrl : The url of the image.
	 * precondition :money must be > 0 and the image url should depict a correct path.
	 * postcondition: It creates a new  Charity Card ,which has the money it costs, the message it prints, and its url.
	 */
	public CharityCard(int money, String message, String ImageUrl) {
		super(money, message, ImageUrl);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param p1 : the player who must pay 
	 * @param jack : the place the money go
	 * postcondition : This method subtracts the player,the money the Charity Card shows,and transfer them to the jackpot
	 */
	public void ActivityOfCard(Player p1,Jackpot jack) {
		// TODO Auto-generated method stub
		if( this.getMoney() > p1.getLefta()) 
		{
			p1.setLoan(this.getMoney()- p1.getLefta());
			p1.setLefta(this.getMoney()- p1.getLefta());
		}
		
		p1.setLefta(-this.getMoney());
	    jack.setJackVal(this.getMoney());
	}

}
