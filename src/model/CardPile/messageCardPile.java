package model.CardPile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import model.Cards.messageCard;

public class messageCardPile {

	private ArrayList<messageCard> mespile;
	
	/**
	 * <b>constructor</b> Constructs an ArrayList of messageCard cards.
	 * Postcondition : It is created an arraylist of messagecards that is now empty.
	 */
	public messageCardPile() {
		mespile = new ArrayList<messageCard>();
	}
	
	/**
	 * <b>tranformer</b>
	 * It adds a new messagecard to the pile.
	 * @param card indicates the messagecard that will be added to the pile.
	 * Postcondition : the mespile arraylist will be by one element bigger as the card is now added to her.
	 */
	public  void AddToPile(messageCard card) {
		mespile.add(card);
	}
	
	/**
	 * <b>observer</b>
	 * @return true or false depending on if the mespile list is empty or not
	 */
	public boolean isEmpty() {
		if(mespile.isEmpty()) 
		{
			return true;
		}else
		{
			return false;
		}
	}
	
	/**
	 * <b>transformer</b> This method takes one card from the messageCard mespile list.
	 * @return the first messagecard card in the list
	 * postcondition : the list is now smaller by one element.as the firts elem is erased.
	 */
	public messageCard removeCard() {
		messageCard c = mespile.get(0);
		mespile.remove(0);
		return c;
		
	}
	
	/**
	 * <b>transformer</b>
	 * this method shuffles the message cards that are in the mespile list
	 * Precondition : the mespile list must include all the deal cards.
	 */
	public void shufflepile() {
		Random random =new Random();
		
		
		long s=random.nextLong();  
	
		Collections.shuffle(mespile,new Random(s));
		
	}
}

