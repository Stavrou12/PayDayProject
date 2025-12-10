package model.Position;

public class Position {

	private String name;
	private int numofpos;
	private final String ImageUrl;
	
	/**
	 * <b>constructor</b> constructs a new Position instance
	 * @param numofpos is the number of the position
	 * @param ImageUrl is the images's url path
	 */
	public Position(int numofpos,String ImageUrl) {
		this.ImageUrl= ImageUrl;
		this.numofpos= numofpos;
	}
	
	/**
	 * <b>transformer</b> sets the name of the position
	 * @param name is the name of the position
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * <b>accessor</b> 
	 * @return the name of the position(a string that represents if it is monday or tuesday..,sunday)
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * <b>transformer</b> sets the number of the position
	 * @param num is the number o fthe position
	 * precondition :   num must be bewtteen 1 and 31
	 */
	public void setPos(int num){
		numofpos= num;
	}
	
	/**
	 * <b>accessor</b> 
	 * @return the number of the position.
	 */
	public int getNumPos() {
		return numofpos;
	}
	
	/**
	 * <b>accessor</b>
	 * @return the path of the image url
	 */
	public String getImage() {
		return ImageUrl;
	}
	
}
