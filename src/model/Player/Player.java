package model.Player;

import java.util.ArrayList;
import java.util.Collections;

import model.Cards.DealCard;
import model.Zari.Zari;

/**
 * class Player
 * @author gnnss
 *
 */
public class Player {

	private int lefta;
	private int logariasmoi;
	private int loan;
	private final String name;
	private int monthLasts;
	private boolean turn;
	private boolean hasFinished;
	private ArrayList<DealCard> mydeals;
	private int currentPos;
	private final Zari zari;
	private Player opponent;
	private boolean cantake;
	
	/**
	 * <b>constructor</b> It constructs a new instance of a player.Also here become the initializations of the values.
	 * @param playerName indicates the name of the player.
	 */
	public Player(String playerName) {
		 lefta=0;
		 logariasmoi=0;
		 loan=0;
		 name=playerName;
		 monthLasts=0;
		turn =false;
		 hasFinished=false;
		 mydeals=new ArrayList<>();
		currentPos=0;
		 zari=new Zari();
		 cantake = false;
		
	}
	
	/**
	 * <b>observer</b> checks if the card stack is empty
	 * @return true or false depending on if the stack with player's cards is empty or not.
	 */
	public boolean isEmptyOfCards() {
		return mydeals.isEmpty();
	}
	
	/**
     * <b>transformer</b>
     *  It sets the opponent of the player.
     * @param antipalos the opponent
     */
    public void setOpponent(Player antipalos) {
        this.opponent = antipalos;
    }
    
    /**
     * <b>accessor</b>
     * @return  The opponent of current player.
     */
    public Player getOpponent() {
        return this.opponent;
    }
    
    /**
     * <b>accessor</b>
     * @return the money of the player
     */
    public int getLefta() {
    	return lefta;
    }
    
    /**
     * <b>transformer</b> It adds the player's money
     * @param money  money represent the value that is added to the player's lefta
     * postcondition : This method changes the player lefta value.
     */
    public void setLefta(int money) {
    	lefta =lefta+ money;
    }
    /**
     * <b>accessor</b>
     * @return the loan of the player
     */
    public int getLoan() {
    	return loan;
    }
    
    /**
     * <b>transformer</b> It makes the loan value = current loan + money
     * @param money  money represent the value that is added to the player's loan
     * postcondition : This method changes the player loan value.
     */
    public void setLoan(int money) {
        loan = money + loan;
    }
    
    /**
     * <b>accessor</b>
     * @return the name of the player
     */
    public String getName() {
    	return name;
    }
    
    /**
     * <b>accessor</b>
     * @return the logariasmoi(bills) of the player
     */
    public int getBill() {
    	return logariasmoi;
    }
    
    /**
     * <b>transformer</b> It makes the bills(logariasmoi) value = current logariasmoi + money
     * @param money  money represent the value that is added to the player's bills
     * postcondition : This method changes the player Bills value.
     */
    public void setBill(int money) {
        logariasmoi= logariasmoi+ money;
    }
    
    /**
     * this method adds the dealcard c in the player's stack
     * @param c indicates the dealcard that the player keeps
     * postcondition: It adds the dealcard elem in the player Arraylist.
     */
    public void keepDealCard(DealCard c) {
    	this.mydeals.add(c);
        Collections.sort(mydeals);   //https://www.geeksforgeeks.org/collections-sort-java-examples/
    }
    
    /**
     * this methods sells the player's dealcard and  removes it from stack
     * @return the first card of the player's stack
     * postcondition : it removes one element from the list.
     */
    public DealCard sellmyDeal() {
    	 DealCard c=mydeals.get(0);
         mydeals.remove(0);
         return  c;
    }
    
    /**
     * <b>transformer</b> This method changes the currentPosition of the player.
     * @param numOfSteps Is the number of steps the palyer will go ahead.
     * postcondition: the currentPos changes.
     */
    public void setPos(int numOfSteps) {
    	if((numOfSteps + currentPos) > 31 ) 
    	{
    		currentPos = 31;
    	}else
    	{
    		currentPos += numOfSteps;
    	}
    	
    }
    
    /**
     * <b>accessor</b> 
     * @return The position of the player.
     */
    public int getPos() {
    	return currentPos;
    }
    
    /**
     * <b>accessor</b>
     * @return thn zaria tou player
     */
    public Zari getZari() {
    	return zari;
    }
    
    /**
     * <b>transformer</b> :sets the turn of the player true or false.
     * @param turn indicates the player turn to be true or false.
     */
    public void setTurnOfPlayer(boolean turn) {
    	if(this.hasFinished) 
    	{
    		this.turn = false;
    	}else 
    	{
    		this.turn = turn;
    	}
    }
    
    /**
     * <b>accessor</b> 
     * @return true if it is the players turn to play,else false.
     */
    public boolean getTurn() {
		return this.turn;
    
    }
    
    /**
     * <b>transformer</b> sets true or false the var hasFinished.
     * @param hasF indicates if hasFinished var will be true or false.
     */
    public void sethasFinished(boolean hasF){
    	hasFinished=hasF;
    }
    
    /**
     * <b>accessor</b>
     * @return if has player has finished .The variable hasFinished.
     */
    public boolean gethasFinished() {
		return this.hasFinished;
    	
    }
    
    /**
     * <b>transformer</b>
     * postcondition : This method changes the remaining months of the player
     * @param months is the months remaining  that the player has to play.
     */
    public void setMonthLasts(int months) {
    	this.monthLasts=months;
    }
    
    /**
     * <b>accessor</b>
     * @return the month that the players is obliged to play in order to finish the game
     */
    public int getMonthLasts() {
		return this.monthLasts;
    	
    }
    
    /**
     * <b>transformer</b>
     * postcondition: this method changes the value of boolean cantake.
     * It depicts if the player can take 1/2 mail card or 1 deal card or not
     * @param f true or false depending on if he should take one or two cards
     */
    public void setCanTake(boolean f) {
    	this.cantake=f;
    }
    
    /**
     * <b>observer</b>
     * @return true or false for the action if the player can take a card or not
     */
    public boolean getCanTake() {
    	return this.cantake;
    }
}
