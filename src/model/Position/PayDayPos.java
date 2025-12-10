package model.Position;


import model.Player.Player;

public class PayDayPos extends Position{

	/**
	 * <b>constructor</b> constructs a new 	PayDayPos Position
	 * @param ImageUrl is the images's url path
	 * 
	 */
	public PayDayPos( String ImageUrl) {
		super(31, ImageUrl);
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * <b>transformer</b> this method makes some action 
	 * depending on epilogi variable the player will pay total loan or 10% of it.
	 * @param p1 represents the player that now is on this position
	 * @param epilogi represents the choice of the player to play whole or a part of the loan
	 * postcondition:the activities of the payday(bill,loan payments,gets 3500money )
	 */
	public void ActivityOfPos(Player p1,int epilogi) {
		if(p1.getMonthLasts() ==1) 
		{
			p1.setLefta(0);
		}
		else if(p1.getMonthLasts()==2)
		{
			p1.setLefta(3500);
		}
		else if(p1.getMonthLasts() ==3)
		{
			p1.setLefta(3500);
		}
		p1.setMonthLasts(p1.getMonthLasts()-1);
		
		//p1.setLefta(3500);
		int tax;
		tax = p1.getLoan()/10;
		if(p1.getLefta()< tax) 
		{
			p1.setLoan(tax - p1.getLefta());
			p1.setLefta(-p1.getLefta());
		}else
		{
			p1.setLefta( -tax);
		}
		
		if(p1.getLefta()< p1.getBill())
		{
			p1.setLoan(p1.getBill() - p1.getLefta());
			p1.setLefta(-p1.getLefta());
			p1.setBill(-p1.getBill());
		}else
		{
			p1.setLefta( -p1.getBill());
			p1.setBill(-p1.getBill());
		}
		if(epilogi==0) 
		{
				if(p1.getLefta()< p1.getLoan())
				{
					p1.setLoan( -p1.getLefta());
					p1.setLefta(-p1.getLefta());
				}else 
				{
					p1.setLefta(-p1.getLoan());
					p1.setLoan(-p1.getLoan());
				}
		}
		
		 if(epilogi==2) { //let the player pay the half loan
			if(p1.getLefta()< p1.getLoan()/2) 
			{
				p1.setLoan( -p1.getLefta()/2);
				p1.setLefta(-p1.getLefta()/2);
			}else
			{
				p1.setLefta(-p1.getLoan()/2);
				p1.setLoan(-p1.getLoan()/2);
			}
		}	
		//}else {
			//nothing
		//}
		
		 if(p1.gethasFinished()==false)
			{
				p1.setPos(-31);
			}
		 
		if(p1.getMonthLasts()<=0) 
		{
			p1.sethasFinished(true);
		}
		
		
		
	}

}
