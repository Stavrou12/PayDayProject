package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.CardPile.CardPile;
import model.CardPile.DealCardPile;
import model.CardPile.messageCardPile;
import model.Cards.AdvertisementCard;
import model.Cards.BillCard;
import model.Cards.CharityCard;
import model.Cards.DealCard;
import model.Cards.GetMoneyFromNeigh;
import model.Cards.PayTheNeigh;
import model.Cards.moveToBuyerOrDeal;
import model.Jackpot.Jackpot;
import model.Player.Player;
import model.Position.BuyerPosition;
import model.Position.DealPosition;
import model.Position.FamilyPos;
import model.Position.LotteryPos;
import model.Position.PayDayPos;
import model.Position.Position;
import model.Position.RadioPos;
import model.Position.StartPos;
import model.Position.SweepstakesPos;
import model.Position.YardSalePos;
import model.Position.messagePos;


public class Controller {
	private ClassLoader cld;
	public Player A;
    public Player B;
    public Position tablo[];
    public DealCardPile DealCard;
    public messageCardPile messageCard;
    public CardPile Pile;
    public Jackpot jackpot;
    
    //++ in faseB
    
    public boolean start;
    public int numA;
    public int numB;
    
    
    /**
     * <b>constructor</b> constructs a new controller in order to play the game
     */
    public Controller() {
    	
    	 cld= this.getClass().getClassLoader();
         jackpot=new Jackpot();
         messageCard =new messageCardPile();
         DealCard =new DealCardPile();
         Pile=new CardPile();
         A = new Player("A");
         B = new Player("B");
         A.setOpponent(B);
         B.setOpponent(A);
         
    }
    
   
    
    /**
     * <b>transformer</b>
     * this method initializes the tablo positions
     * postcondition: we will have an array with all positions
     */
    public void initBoard() {
    	
    	 tablo = new Position[32];
    	 tablo[0] = new StartPos("resources/images/start.png");
         tablo[31] = new PayDayPos("resources/images/pay.png");
         
         for(int i =1;i<5;i++)
         {
        	 tablo[i]=new messagePos(0,"resources/images/mc1.png",true);
         }
         for(int i =5;i<9;i++) 
         {
        	 tablo[i]=new messagePos(0,"resources/images/mc2.png",false);
         }
         for(int i =9;i<14;i++)
         {
        	 tablo[i]=new DealPosition(0,"resources/images/deal.png");
         }
         for(int i =14;i<16;i++)
         {
        	 tablo[i]=new SweepstakesPos(0,"resources/images/sweep.png");
         }
         for(int i =16;i<19;i++) 
         {
        	 tablo[i]=new 	LotteryPos(0,"resources/images/lottery.png");
         }

         for(int i =19;i<21;i++) 
         {
        	 tablo[i]=new RadioPos(0,"resources/images/radio.png");
         }

         for(int i =21;i<27;i++) 
         {
        	 tablo[i]=new BuyerPosition(0,"resources/images/buyer.png");
         }
         for(int i =27;i<29;i++) 
         {
        	 tablo[i]=new FamilyPos(0,"resources/images/casino.png");
         }
         for(int i =29;i<31;i++) 
         {
        	 tablo[i]=new YardSalePos(0,"resources/images/yard.png");
         }
         
    	RandomPos(tablo);
    }
    
    /**
     * this method make the position of the Position be at a random place each time except from start and last day.
     * precondition:must have initialize the positions first.
     * postcondition:returns an array with the positions be at a random places,except from last and first day.
     * @param pos array thas has the positions
     */
    public static void RandomPos(Position[] pos) {
    	int length = pos.length;
    	int i =1;
    	while(i<length-1)
    	{
    		int randnum;
    		randnum= (int)(Math.random()*((length-1)-i)) +i; 
    		Position temp= pos[i];
    		pos[i]=pos[randnum];
    		pos[randnum]=temp;     
    	  i = i+1; //epomenh thesi
    	}
    	
    	pos[0].setName("Start");
    	pos[0].setPos(0);
    	
    	pos[31].setName("Wednes.");
    	pos[31].setPos(31);
    	
    	int j =1;
    	while(j<length-1)
    	{
    		pos[j].setPos(j);
    		if(j%7 == 0)
    		{
    			pos[j].setName("Sunday");
    		}
    		if(j%7 == 1) 
    		{
    			pos[j].setName("Monday");
    		}
    		 if(j%7 == 2)
    		 {
    			pos[j].setName("Tuesday");
    		}
    		if(j%7 == 3) 
    		{
    			pos[j].setName("Wednesday");
    		}
    		if(j%7==4) 
    		{
    			pos[j].setName("Thursday");
    		}
    		if(j%7 ==5 ) 
    		{
    			pos[j].setName("Friday");
    		}
    	    if(j%7 ==6)
    	    {
    			pos[j].setName("Saturday");
    		}
    		j++;
    	}
    	
    }
   
 
    /**
     * <b>transformer</b>
     * In this function we will initialize our message and deal card piles.Also the CardPile .The three classes from CardPile package
     * postcondition: there will be initialized 3 stacks.
     */
    public void  initCardPile() {
    
    	String dealcards[][]= readFile("resources/dealCards_greeklish.csv", "Deal");
    	String mescards[][]= readFile( "resources/mailCards_greeklish.csv", "Mail");
    	
    	//gia tis  mail cards
    	int i=0;
    	while(i<48)
    	{
    		if(mescards[i][1].equals("Advertisement")) 
    		{
    			messageCard.AddToPile(new AdvertisementCard(Integer.parseInt(mescards[i][4]),mescards[i][2],mescards[i][5]));
    		}
    		if(mescards[i][1].equals("Bill"))
    		{
    			messageCard.AddToPile(new BillCard(Integer.parseInt(mescards[i][4]),mescards[i][2],mescards[i][5]));
    		}
            
            
            if(mescards[i][1].equals("PayTheNeighbor"))
            {
            	messageCard.AddToPile(new PayTheNeigh(Integer.parseInt(mescards[i][4]),mescards[i][2],mescards[i][5]));
            }
            
           if(mescards[i][1].equals("MadMoney"))
           {
        	   messageCard.AddToPile(new GetMoneyFromNeigh(Integer.parseInt(mescards[i][4]),mescards[i][2],mescards[i][5]));
           }
            
            if(mescards[i][1].equals("MoveToDealBuyer"))
            {
            	messageCard.AddToPile(new moveToBuyerOrDeal(mescards[i][2],mescards[i][5]));
            }
            if(mescards[i][1].equals("Charity")) 
            {
            	messageCard.AddToPile(new CharityCard(Integer.parseInt(mescards[i][4]),mescards[i][2],mescards[i][5]));
            }
            
            
            i++;
    	}
    	messageCard.shufflepile();
    	//twra gia tis kartes symfwnias
    	int j = 0;
    	while(j<20) 
    	{
    		int sell = Integer.parseInt(dealcards[j][4]);
    		 int buy = Integer.parseInt(dealcards[j][3]);
    		 String image = dealcards[j][5];
             String mess = dealcards[j][2];
            
             DealCard.AddToPile(new DealCard(buy,mess,image,sell));  
             j=j+1;
    	}
    	DealCard.shufflepile();
    }
    
    
    /**
     * <b>transformer</b>
     * initializes the player's money at the start
     */
    public void paydayStart() {
    	A.setLefta(3500);
    	B.setLefta(3500);
    }
    
    /**
     * <b>transformer</b>.It sets how month the players will play.
     * precodition:month number must be between 1 -3
     * 
     * @param num represents how many months remaining.
     */
    public void setMonthPlayer(int num) {
    	A.setMonthLasts(num);
    	B.setMonthLasts(num);
    }
    
    /**
     * <b>transformer</b>
     * This method decided who of the players will play first according to the Zari number they got.
     * The one with the bigger num plays first.
     * precondition:numA,numB must be different
     * @param numA Zari of A player
     * @param numB Zari of B player.
     */
    public void FirstPlayer(int numA,int numB) {
    	if( numA > numB) 
    	{
    		A.setTurnOfPlayer(true);
    	}else
    	{
    		B.setTurnOfPlayer(true);
    	}
    }
    
  
    
    /**
     * <b>transformer</b>
     * this methods takes the money from the jackpot and puts them in the player's money.
     * @param p1 the player who wins the jackpot
     * Postcondition:the jackpot money are added to the player's money.
     */
    public  void WinJack(Player p1)
    {
    	p1.setLefta(this.jackpot.getJackVal());
    }
    
    /**
     * <b>observer</b>
     * this function checks if the game has finished
     * @return true if the game has finished else false.
     */
    public boolean GameF() 
    {
		return B.gethasFinished() && A.gethasFinished();
    
    }
    
    /**
     * this method returns the description ofthe winner
     * @return the winner of the game
     */
    public String getWinner() 
    {
    	numA=A.getLefta()-A.getBill()-A.getLoan();
    	numB=B.getLefta()-B.getBill()-B.getLoan();
    	
		if((A.getLefta()-A.getBill()-A.getLoan()) > (B.getLefta()-B.getBill()-B.getLoan())) 
		{
			return " Ο παικτης Α κέρδισε!";
		}else if( (A.getLefta()-A.getBill()-A.getLoan()) <(B.getLefta()-B.getBill()-B.getLoan()))
		{
			return " Ο παικτης B κέρδισε!";
		}
		else 
		{
			return "Ισοπαλια!";
		}
    	
    }
    
    /**
     * <b>transformer</b>
     * this method  puts all the card of the player in the CardPile
     * @param p1 Player
     */
    public void lastCards(Player p1) {
    	if(p1.gethasFinished())
    	{
           while(!p1.isEmptyOfCards())
           {
        	   this.Pile.AddToCardPile(p1.sellmyDeal());
            }
        }
    }
    
    //++phase B
    public String[][] readFile(String path, String type) { //etoimos kwdikas apo to arxeio poy mas dothike
    	
    	String[][] mailCards = new String[48][4];
        String[][] dealCards = new String[20][8];
		BufferedReader br = null;
		String sCurrentLine;
		try {
			String fullPath = cld.getResource(path).getPath();
			br = new BufferedReader(new FileReader(fullPath));
		} catch (FileNotFoundException ex) {
			Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
		}
		int count = 0;
		int splitCount = 0;
		HashMap<Integer, String> domainsMap = new HashMap<>();
		try {
			br.readLine();
			while ((sCurrentLine = br.readLine()) != null) {
				if (type.equals("Deal")) {
					dealCards[count++] = sCurrentLine.split(",");
				} else {
					mailCards[count++] = sCurrentLine.split(",");
				}
			}
			br.close();
		} catch (IOException ex) {
			Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
		}
		if (type.equals("Deal")) return dealCards;
        else return mailCards;
        
	}
    
    /**
     * This method is responsible for updating the info box in the game through the view class
     * @return a string[] for updating the turn of the player and how many months remain
     */
    public String[] info_box() {
    	String info[]=new String [2];
    	 if(A.getMonthLasts() < B.getMonthLasts()) 
    	 {
    		 info[0]=B.getMonthLasts()+" Month/s Left";
    	 }else 
    	 {
    		 info[0]=A.getMonthLasts()+ " Month/s Left";
    	 }
    	 
    	 if(A.getTurn())
    	 {
    		 info[1]="Turn :Player A";
    	 }
    	 else if(B.getTurn())
    	 {
    		 info[1]="Turn :Player B";
    	 }
    	 
    	 
    	 return info;
    }
   

}
