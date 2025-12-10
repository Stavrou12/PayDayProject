package model.CardPile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.Cards.DealCard;

public class DealCardPile {

	private ArrayList<DealCard> deal;
	
	/**
	 * <b>constructor</b> Constructs an ArrayList of DealCard cards.
	 * Postcondition : It is created an arraylist of dealcards that is now empty.
	 */
	public DealCardPile() {
		deal = new ArrayList<DealCard>();
	}
	
	/**
	 * <b>tranformer</b>
	 * It adds a new dealcard to the pile.
	 * @param c indicates the dealcard that will be added to the pile.
	 * Postcondition : the deal arraylist will be by one element bigger as the card is now added to her.
	 */
	public void AddToPile(DealCard c) {
		deal.add(c);
	}
	
	/**
	 * <b>observer</b>
	 * @return true or false depending on if the deal list is empty or not
	 */
	public boolean isEmpty() {
		if(deal.isEmpty())
		{
			return true;
		}else 
		{
			return false;
		}
			
	}
	
	/**
	 * <b>transformer</b> This method takes one card from the DealCard deal pile.
	 * @return the first dealcard card in the list
	 * postcondition : the list is now smaller by one element.as the firts elem is erased.
	 */
	public DealCard removeCard() {
		 DealCard c = deal.get(0);
         deal.remove(0);
         return c;
		
	}
	
	/**
	 * <b>transformer</b>
	 * this method shuffles the Deal cards that are in the deal list
	 * Precondition : the deal list must include all the deal cards.
	 */
	public void shufflepile() {
        Random random =new Random();
		
		
		long s=random.nextLong();  
		Collections.shuffle(deal,new Random(s));
	}
}

