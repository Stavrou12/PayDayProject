package model.Position;

public class messagePos extends Position{

	private final boolean CardGot;
	/**
	 * <b>constructor</b> constructs a new 	messagePos Position
	 * @param numofps is the number of the position 
	 * @param ImageUrl is the images's url path
	 * @param CardGot is true or false.
	 * precondition : numofpos must be between 1 and 30 and the numofpos is not taken by the opponent.
	 * postcondition: it creates a new messagepos position with the additional variable boolean CardGot = true if draws 1 card, else false.
	 */
	public messagePos(int numofps, String ImageUrl,boolean CardGot) {
		super(numofps, ImageUrl);
		// TODO Auto-generated constructor stub
		this.CardGot= CardGot;
	}
	
	/**
	 * <b>accessor</b>
	 * @return how many(1 or 2) the player message cards draws.(true if 1,false if 2)
	 */
	public boolean getCardGot() {
		return CardGot;
	}

}
