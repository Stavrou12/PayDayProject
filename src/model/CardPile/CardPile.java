package model.CardPile;

import java.util.ArrayList;


import model.Cards.Card;
import model.Cards.messageCard;
import model.Cards.DealCard;
public class CardPile {

	private ArrayList<Card> ThrowPile;
	
	/**
	 * <b>constructor</b> It constructs a new CardPile instance.
	 * Postcondition : Now we have created a new list that is empty. 
	 */
	public CardPile() {
		ThrowPile =new ArrayList<Card>();
    }
	
	/**
	 * <b>transformer</b>
	 * Adds the Card card to the throw pile.
	 * @param card indicates the card that will be added to the ThrowPile list
	 * Postcondition: The ThrowPile list is now bigger ,is not empty.The new element is added at the start
	 */
	public void AddToCardPile(Card card) {
		ThrowPile.add(card);
	}
	
	/**
	 * <b>observer</b>
	 * @return true or false depending on if the throwpile list is empty or not
	 */
	public boolean isEmpty() {
		return ThrowPile.isEmpty();
	}
	
	/**
	 * <b>transformer</b> This method puts the cards to their piles(messageCardPile or DealCardPile) depending on if the card belongs to messageCard or DealCard
	 * @param mes is the pile of mail cards
	 * @param deal is the pile of deal cards
	 * postcondition:the throwpile list will not have any element now.
	 */
	public void PutBack( messageCardPile mes ,DealCardPile deal  ) {
		while (!ThrowPile.isEmpty())
		{
			Card c = ThrowPile.get(0);// prwto stoixeio
			ThrowPile.remove(0);
			if (c instanceof messageCard) 
			{
				mes.AddToPile((messageCard) c);
			} else 
			{
				deal.AddToPile((DealCard) c);
			}
		}
		mes.shufflepile();
		deal.shufflepile();
	}
}

