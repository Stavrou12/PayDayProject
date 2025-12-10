package model.Cards;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class DealCard extends Card implements Comparable<DealCard>{

	private final int SellCost;
	/**
	 * <b>constructor</b> : It constructs a DealCard card.
	 * @param money : It depicts the money that the card costs.
	 * @param message : Is the message the card shows.
	 * @param ImageUrl : The url of the image.
	 * @param SellCost : the cost of the card that the player must pay to buy it.
	 * postcondition :It creates a DealCard card with the money it costs,the message it prints, and its url.
	 */
	public DealCard(int money, String message, String ImageUrl,int SellCost) {
		super(money, message, ImageUrl);
		// TODO Auto-generated constructor stub
		this.SellCost = SellCost;
	}
    
	/**
	 * @param p1
	 * postcondition: if the player buys the card ,we add this card in the player's cards,else we throw it 
	 */
	@Override
	public void ActivityOfCard(Player p1) {
		// TODO Auto-generated method stub
		p1.setLefta(-this.getMoney());
		p1.keepDealCard(this);
	}
	
	/**
	 * <b>accessor</b> : it returns the sellcost of the dealcard.
	 * @return SellCost
	 */
	public int getSellCost() {
		return SellCost;
	}
	
	/**
	 * <b>accessor</b> : it returns the profit the player had from selling the deal card
	 * @return the profit the player had from dealcard 
	 */
	public int getProfit() {
		return SellCost - super.getMoney();
	}
    
	/**
	 * 
	 * @param deal :it is the DealCard 
	 * @return the value that dealcards are sorted.
	 */
	public int compareTo(DealCard deal) {
		return deal.getProfit()-this.getProfit();
		
        
    }
}
