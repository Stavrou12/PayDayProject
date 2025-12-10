package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;
import javax.swing.JTextField;
import java.awt.EventQueue;
import java.awt.FlowLayout;


import model.Cards.AdvertisementCard;
import model.Cards.BillCard;
import model.Cards.Card;
import model.Cards.CharityCard;
import model.Cards.DealCard;
import model.Cards.GetMoneyFromNeigh;
import model.Cards.PayTheNeigh;
import model.Cards.messageCard;
import model.Cards.moveToBuyerOrDeal;
import model.Player.Player;
import model.Position.BuyerPosition;
import model.Position.DealPosition;
import model.Position.FamilyPos;
import model.Position.LotteryPos;
import model.Position.PayDayPos;
import model.Position.RadioPos;
import model.Position.SweepstakesPos;
import model.Position.YardSalePos;
import model.Position.messagePos;
import model.Zari.Zari;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;


import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;

import controller.Controller;

/**
 * 
 * @author gnnss
 *
 */
public class GUI extends JFrame {
	int lotteryA;
	int lotteryB;
	private boolean LotteryPos= false;
	private boolean RadioPos =   false;
	Controller paixnidi;
	private JFrame frame = new JFrame();
	private JTextField txtMoneya = new JTextField();
	private JTextField txtBilla= new JTextField();
	private JTextField txtLoana= new JTextField();
	private JTextField textField=  new JTextField();
	private JTextField textField_1= new JTextField();
	private JTextField textField_2= new JTextField();
	private JTextField txtInfoBox= new JTextField();
	private JTextField txtMonthsremain= new JTextField();
	private JTextField txtTurn= new JTextField();
	private JTextField textField_3= new JTextField();
	private ClassLoader classld;
	private URL ImageUrl ;
	
	JButton btnmessagecard = new JButton("messagecard");
	JButton btnDealcard = new JButton("dealcard");
	JLabel lblPaydayim = new JLabel("PayDayIm");
	JDesktopPane desktopPane = new JDesktopPane();
	JLabel lblPlayera = new JLabel("PlayerA");
	JButton btnRoola = new JButton("rollA");
	JButton btnDeala = new JButton("MY DEALS");
	JButton btnZaria = new JButton("zariA");
	JButton btnGetloana = new JButton("GET LOAN");
	JButton btnEndturna = new JButton("END TURN");

	JDesktopPane desktopPane_1 = new JDesktopPane();
	JLabel lblPlayerb = new JLabel("PlayerB");
	JButton btnRoola_1 = new JButton("roolB");
	JButton btnDeala_1 = new JButton("MY DEALS");
	JButton btnZaria_1 = new JButton("zariB");
	JButton btnEndturna_1 = new JButton("END TURN");
	JButton btnGetloana_1 = new JButton("GET LOAN");
	
	JDesktopPane desktopPane_3 = new JDesktopPane();
	
	JDesktopPane[] position =  new JDesktopPane[35];
    JLayeredPane pioniPos[] = new JLayeredPane[32];
	JDesktopPane tablo = new JDesktopPane();
	JTextField jackf = new JTextField();
	
	 JTextField temp1;
	 
	 JDesktopPane jackp = new JDesktopPane();
	 JLabel jackl = new JLabel();
	 
	 
	 int mailcardcount=0;
	 
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @throws IOException 
	 */
	public GUI() throws IOException {
		initialize();
	}

	
	
	/**
	 * Initialize the contents of the frame.
	 * @throws IOException 
	 */
	public void initialize() throws IOException {
		paixnidi = new Controller();
		classld = this.getClass().getClassLoader();
		
		
		
		
		frame.getContentPane().setBackground(new Color(0, 51, 0));
		frame.setBounds(100, 100, 1259, 724);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnmessagecard.setBounds(898, 363, 155, 62);
		btnmessagecard.setIcon(new ImageIcon(new ImageIcon("src/resources/images/mailCard.png").getImage().getScaledInstance(btnmessagecard.getWidth(),btnmessagecard.getHeight() , Image.SCALE_DEFAULT)));
		btnmessagecard.addActionListener(new CardListener());
		frame.getContentPane().add(btnmessagecard);
		
		
		btnDealcard.setBounds(1063, 363, 153, 62);
		btnDealcard.setIcon(new ImageIcon(new ImageIcon("src/resources/images/dealCard.png").getImage().getScaledInstance(btnDealcard.getWidth(),btnDealcard.getHeight() , Image.SCALE_DEFAULT)));
		btnDealcard.addActionListener(new CardListener());
		frame.getContentPane().add(btnDealcard);
		
		btnDealcard.setEnabled(true);
		btnmessagecard.setEnabled(true);
		
		lblPaydayim.setBackground(new Color(255, 0, 0));
		
		lblPaydayim.setBounds(10, 10, 865, 176);
		lblPaydayim.setIcon(new ImageIcon(new ImageIcon("src/resources/logo.png").getImage().getScaledInstance(lblPaydayim.getWidth(),lblPaydayim.getHeight() , Image.SCALE_DEFAULT)));
		
		frame.getContentPane().add(lblPaydayim);
		
		
		desktopPane.setBackground(Color.GRAY);
		desktopPane.setBounds(898, 16, 318, 229);
		frame.getContentPane().add(desktopPane);
		
		
		lblPlayera.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayera.setBounds(10, 1, 127, 27);
		
		desktopPane.add(lblPlayera);
		
		
		txtMoneya.setFont(new Font("Tahoma", Font.PLAIN, 11));
	
		txtMoneya.setBounds(10, 38, 108, 27);
		txtMoneya.setEditable(false);
		txtMoneya.setOpaque(false);
		txtMoneya.setBorder(null);
		desktopPane.add(txtMoneya);
		txtMoneya.setColumns(10);
		
		txtBilla = new JTextField();
		txtBilla.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtBilla.setBounds(10, 86, 108, 27);
		txtBilla.setEditable(false);
		txtBilla.setOpaque(false);
		txtBilla.setBorder(null);
		desktopPane.add(txtBilla);
		txtBilla.setColumns(10);
		
		txtLoana = new JTextField();
		txtLoana.setFont(new Font("Tahoma", Font.PLAIN, 11));
		
		txtLoana.setBounds(10, 60, 108, 27);
		txtLoana.setEditable(false);
		txtLoana.setOpaque(false);
		txtLoana.setBorder(null);
		desktopPane.add(txtLoana);
		txtLoana.setColumns(10);
		btnDeala.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnDeala.setForeground(Color.BLACK);
		
		
	
		
		
		btnDeala.setBounds(10, 144, 142, 27);
		btnDeala.addActionListener(new ButtonListenerA() );
		desktopPane.add(btnDeala);
		
		
		btnGetloana.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGetloana.addActionListener(new  ButtonListenerA() ); 
	
		btnGetloana.setBounds(10, 187, 127, 32);
		desktopPane.add(btnGetloana);
		btnEndturna.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		
		btnEndturna.setBounds(162, 187, 127, 32);
		btnEndturna.addActionListener(new  ButtonListenerA() ); 
		desktopPane.add(btnEndturna);
		
		
		btnZaria.setBounds(232, 107, 76, 67);
		btnZaria.addActionListener(new ZariListener());
		desktopPane.add(btnZaria);
		
		
		desktopPane_1.setBackground(Color.GRAY);
		desktopPane_1.setBounds(898, 427, 319, 250);
		frame.getContentPane().add(desktopPane_1);
		
		
		lblPlayerb.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPlayerb.setBounds(10, 0, 127, 30);
		
		desktopPane_1.add(lblPlayerb);
		
		textField = new JTextField();
	
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setColumns(10);
		textField.setBounds(10, 26, 145, 27);
		textField.setEditable(false);
		textField.setOpaque(false);
		textField.setBorder(null);
		desktopPane_1.add(textField);
		
		textField_1 = new JTextField();
		
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(10, 57, 145, 30);
		textField_1.setEditable(false);
		textField_1.setOpaque(false);
		textField_1.setBorder(null);
		desktopPane_1.add(textField_1);
		
		textField_2 = new JTextField();
		
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(10, 90, 145, 30);
		textField_2.setEditable(false);
		textField_2.setOpaque(false);
		textField_2.setBorder(null);
		desktopPane_1.add(textField_2);
		btnDeala_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		
		
		btnDeala_1.setBounds(10, 163, 145, 30);
		btnDeala_1.addActionListener(new ButtonListenerB());
		desktopPane_1.add(btnDeala_1);
		
		
		btnZaria_1.setBounds(227, 109, 82, 71);
		btnZaria_1.addActionListener(new ZariListener());
		desktopPane_1.add(btnZaria_1);
		btnEndturna_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		
		
		btnEndturna_1.setBounds(157, 210, 127, 30);
		btnEndturna_1.addActionListener(new ButtonListenerB());
		desktopPane_1.add(btnEndturna_1);
		
		
		btnGetloana_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnGetloana_1.setBounds(20, 210, 127, 30);
		btnGetloana_1.addActionListener(new ButtonListenerB());
		desktopPane_1.add(btnGetloana_1);
		
		
		
		desktopPane_3.setBounds(898, 249, 318, 110);
		desktopPane_3.setBackground(Color.WHITE);
		frame.getContentPane().add(desktopPane_3);
		
		
		txtInfoBox.setText("info box");
		txtInfoBox.setBounds(10, 10, 298, 19);
		txtInfoBox.setBorder(null);
		txtInfoBox.setEditable(false);
		txtInfoBox.setOpaque(false);
		
		desktopPane_3.add(txtInfoBox);
		txtInfoBox.setColumns(10);
		
		txtMonthsremain.setBounds(10, 30, 298, 19);
		txtMonthsremain.setEditable(false);
		txtMonthsremain.setOpaque(false);
		txtMonthsremain.setBorder(null);
		desktopPane_3.add(txtMonthsremain);
		txtMonthsremain.setColumns(10);
		
		txtTurn.setBounds(10, 50, 298, 19);
		txtTurn.setEditable(false);
		txtTurn.setOpaque(false);
		txtTurn.setBorder(null);
		desktopPane_3.add(txtTurn);
		txtTurn.setColumns(10);
		
	
		textField_3.setText("==>");
		textField_3.setBounds(10, 79, 298, 29);
		textField_3.setOpaque(false);
		textField_3.setEditable(false);
		textField_3.setBorder(null);
		desktopPane_3.add(textField_3);
		textField_3.setColumns(10);
		
		Start_Game();
}
	
	/**
	 * This method calls some functions from the controller in order to init the board and the game.Then throuhgh view class functions initializies
	 * the player's info,the pawns of the players at the start,the info box,and the contents of the tablo.
	 */
	private void Start_Game() {
	
	   paixnidi.initCardPile();
	   month mdial = new month();
		paixnidi.setMonthPlayer(Integer.parseInt(mdial.getMonth()));
    	paixnidi.paydayStart();
	paixnidi.initBoard();
	TABLO();
	
	frame.getContentPane().add(tablo);
	refreshinfobox(">>");
	refreshZariNum("A",6);
	refreshZariNum("B",6);
	updatePioniPosition("A",paixnidi.A.getPos()) ;
	updatePioniPosition("B",paixnidi.A.getPos()) ;
	updatePlayersInfo();
	
	}
	
	/**
	 * this method inits the board of the game in user interface with the image of each position and the jackpot image and value at the start 
	 */
	public void TABLO() {
		tablo.setBounds(20, 196, 855, 481);
		tablo.setOpaque(false);
		 GridLayout grid = new GridLayout(0, 7);
		 tablo.setLayout(grid);
		 for (int i = 0; i < 32; i++) {
	            position[i] = new JDesktopPane();
	            temp1 = new JTextField();
	            temp1.setText(paixnidi.tablo[i].getName()+" "+paixnidi.tablo[i].getNumPos());
	            ImageUrl = classld.getResource(paixnidi.tablo[i].getImage());
	  
	            Image pos = new ImageIcon(ImageUrl).getImage();
	            pioniPos[i] = new JLayeredPaneIm(pos.getScaledInstance(120,100,Image.SCALE_SMOOTH));

	            pioniPos[i].setLayout(new FlowLayout());

	            temp1.setEditable(false); //den mporw twra na grapsw otan exw to interface anoixto
	           
	            
	            temp1.setBackground(Color.YELLOW);
	            temp1.setFont(new Font(null, Font.BOLD, 12));
	            temp1.setMaximumSize(new Dimension(120, 30));

	            position[i].setLayout(new BoxLayout(position[i],BoxLayout.Y_AXIS));
	            position[i].add(temp1);
	            position[i].add(pioniPos[i]);
	            tablo.add(position[i]);
	        }
		
		 jackp.setLayout(new BoxLayout(jackp, BoxLayout.Y_AXIS));
	     jackp.setOpaque(false);
		 
		 	     JLabel tmp = new JLabel();
		 	     tablo.add(tmp);
		 jackf.setForeground(new Color(0, 0, 0));
		 tablo.add(jackf);
		 jackf.setText(paixnidi.jackpot.getJackVal()+" Euro");
		 jackf.setOpaque(false);
		 jackf.setEditable(false);
	     
	     jackf.setHorizontalAlignment(JTextField.CENTER);
	     jackf.setFont(new Font(null, Font.BOLD, 15));
	     
	  
	     
	     jackl.setIcon(new ImageIcon(new ImageIcon("src/resources/images/jackpot.png").getImage().getScaledInstance(140,120 , Image.SCALE_DEFAULT)));
	     
	     jackp.add(jackl);
	     tablo.add(jackp);
	}
	
	/**
	 * this class adds an image on a JLayeredPane
	 * @author gnnss
	 *
	 */
	public class JLayeredPaneIm extends JLayeredPane {

        private Image image;

        public JLayeredPaneIm(Image imge) 
        {
            image = imge;
        }

   

        @Override
        public void paintComponent(Graphics g)
        {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, this);
        }
    }
	/**
	 * Action listener for the cards
	 */
	    private class CardListener implements ActionListener {
		Player p1;

		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			if (paixnidi.A.getTurn())	
			{
				p1 = paixnidi.A;
			}
			else if(paixnidi.B.getTurn())
			{ 
				p1 = paixnidi.B;
			}
			else 
			{ //does nothing
			}

			if (e.getSource()==btnmessagecard && paixnidi.tablo[p1.getPos()] instanceof messagePos) 
			{
				
				if (paixnidi.messageCard.isEmpty()) 
				{
					paixnidi.Pile.PutBack(paixnidi.messageCard, paixnidi.DealCard);
				}
				
				messagePos po = (messagePos) paixnidi.tablo[p1.getPos()];
				if (p1.getCanTake())
				{
					
					messageCard c = (messageCard) paixnidi.messageCard.removeCard();
					
					showMailCard(c);
					paixnidi.Pile.AddToCardPile(c);
					mailCardActivity(p1, c);
					
					if (po.getCardGot() && !(c instanceof moveToBuyerOrDeal)) 
					{
						p1.setCanTake(false);
						refreshinfobox("mail Card was taken from "+ p1.getName());
					} else 
					{
						mailcardcount =mailcardcount+1;
						if (mailcardcount >= 2 && !(c instanceof moveToBuyerOrDeal))
						{
							p1.setCanTake(false);
							refreshinfobox("mail Card was taken from "+ p1.getName());
							mailcardcount = 0;
						}
					}
				}
			}
			if ( e.getSource()==btnDealcard && paixnidi.tablo[p1.getPos()] instanceof DealPosition ) 
			{

				if (p1.getCanTake()) 
				{
					if (paixnidi.DealCard.isEmpty()) 
					{		
						paixnidi.Pile.PutBack(paixnidi.messageCard, paixnidi.DealCard);
					}

					DealCard c = (DealCard) paixnidi.DealCard.removeCard();

					if (showDealCard("show",c)==0) 
					{
						if (c.getMoney() > p1.getLefta())
						{
							
							refreshinfobox("Player "+p1.getName()+ " Must get a loan in order to buy this card " );
							loan l = new loan();
							if (c.getMoney() <= (p1.getLefta() + Integer.parseInt(l.getloan()))) 
							{
								p1.setLoan(Integer.parseInt(l.getloan()));
								p1.setLefta(Integer.parseInt(l.getloan()));
								c.ActivityOfCard(p1);
								refreshinfobox("The player " + p1.getName() +" bought the card");
								updatePlayersInfo();
							} else
							{
								refreshinfobox(p1.getName()+ " Cannot buy this card");
								paixnidi.Pile.AddToCardPile(c);
							}
						} else
						{
							c.ActivityOfCard(p1);
							refreshinfobox("The player" + p1.getName() + " bought the card");
							updatePlayersInfo();
						}
					} else
					{
						paixnidi.Pile.AddToCardPile(c);
					}
					p1.setCanTake(false);
				} else 
				{
                //does nothing
				}
			}
		}
}
	    
	    /**
	     * action listener of player A buttons
	     */
	    private class ButtonListenerA implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String s ;
				s = e.getActionCommand();
			if(paixnidi.A.getTurn()) 
			{
				if( (s.equals("END TURN") ) && paixnidi.A.getZari().getRoll()) 
				{
					
				     if(paixnidi.A.getCanTake()) {
						
						//does nothing
					}
					else if(RadioPos||LotteryPos) {
						//does nothing
					}
					else if(paixnidi.B.gethasFinished()) 
					{
						if(paixnidi.A.gethasFinished()) 
						{
							paixnidi.A.setTurnOfPlayer(false);
						}
						else
						{
							btnZaria.setEnabled(true);
							paixnidi.A.getZari().setRoll(false);
							paixnidi.A.setTurnOfPlayer(true);
							refreshinfobox(">> ");
						}
					}
					else
					{
							btnZaria_1.setEnabled(true);
							paixnidi.B.setTurnOfPlayer(true);
							paixnidi.A.setTurnOfPlayer(false);
							paixnidi.A.getZari().setRoll(false);
						
							refreshinfobox(" ");
					}
				
				}
			    else if(s.equals("GET LOAN")) 
			    {
					getLoan(paixnidi.A);
				}
				
				else if(s.equals("MY DEALS") && paixnidi.tablo[paixnidi.A.getPos()] instanceof BuyerPosition) 
				{
					
					updateDeal(paixnidi.A);
				}
			}
				
		}
	 }			
			
	        	
	    /**
	     * action listener of player B buttons
	     */
	    private class ButtonListenerB implements ActionListener {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String s ;
				s = e.getActionCommand();
			if(paixnidi.B.getTurn())
			{
				if ((s.equals("END TURN")) && paixnidi.B.getZari().getRoll())
				{
					
					 if (paixnidi.B.getCanTake()) 
					 {
							// does nothing
					 } else if (RadioPos || LotteryPos)
					 {
							// does nothing
				     }
					 else if (paixnidi.A.gethasFinished()) 
					 {
						   if (paixnidi.B.gethasFinished())
						   {

							paixnidi.B.setTurnOfPlayer(false);
						  } else 
						  {
							btnZaria_1.setEnabled(true);
							paixnidi.B.getZari().setRoll(false);
							paixnidi.B.setTurnOfPlayer(true);
							refreshinfobox(">> ");
						}

					}
					else
					{
						btnZaria.setEnabled(true);
						paixnidi.A.setTurnOfPlayer(true);
						paixnidi.B.setTurnOfPlayer(false);
						paixnidi.B.getZari().setRoll(false);
						
						refreshinfobox(" >>");
					}
				}
				
				else if(s.equals("GET LOAN"))
				{
					getLoan(paixnidi.B);
				}
				
				else if(s.equals("MY DEALS") && paixnidi.tablo[paixnidi.B.getPos()] instanceof BuyerPosition) 
				{
					
					updateDeal(paixnidi.B);
				}
			}
				
		   }
	        	
	    }
	    
	    /**
	     * if the player take one message card we change the graphics depending on the card info and does the proper functions depending on the kind of mail card.
	     * @param p1 is the  player who draws the card.
	     * @param Card is the messageCard taken.
	     */
	     public void mailCardActivity(Player p1, messageCard Card) {
	    	 
		if (Card instanceof AdvertisementCard)
		{
			AdvertisementCard c = (AdvertisementCard)Card;
			c.ActivityOfCard(p1);
			refreshinfobox("The advertisement was sold!");
			updatePlayersInfo();
		}
		
		else if (Card instanceof BillCard)
		{
			BillCard c =(BillCard)Card;
			c.ActivityOfCard(p1);
			refreshinfobox("Bill was added");
			updatePlayersInfo();
		}
		else if (Card instanceof CharityCard)
		{
			CharityCard c =(CharityCard)Card;
			c.ActivityOfCard(p1,paixnidi.jackpot);
			refreshinfobox("Charity was paid");
			
			 
			 updatePlayersInfo();
			 jackf.setText(paixnidi.jackpot.getJackVal()+" Euro");
		}
		else if (Card instanceof GetMoneyFromNeigh)
		{
			GetMoneyFromNeigh c= (GetMoneyFromNeigh)Card;
			c.ActivityOfCard(p1);
			refreshinfobox("The player "+p1.getName()+" got the money");
			
			updatePlayersInfo();
			
		}
		else if (Card instanceof PayTheNeigh)
		{
			PayTheNeigh c= (PayTheNeigh)Card;
			c.ActivityOfCard(p1);
			refreshinfobox("The player "+p1.getOpponent().getName()+" got the money");
			
			updatePlayersInfo();
		}
		else if (Card instanceof moveToBuyerOrDeal)
		{
			
			
			pioniPos[p1.getPos()].removeAll();
			if(p1.getOpponent().getName()==p1.getName()) 
			{ 	
				updatePioniPosition(p1.getOpponent().getName(),p1.getOpponent().getPos());
			}
			pioniPos[p1.getPos()].repaint();
			
			p1.setPos(((moveToBuyerOrDeal)Card).ActivityOfCard(p1,paixnidi.tablo) - p1.getPos());
			updatePioniPosition(p1.getName(),p1.getPos());
			refreshinfobox("player "+p1.getName()+"moved to buyer or deal pos");
			ActionsByPosition(p1,p1.getPos());
		}

	  }
	    
	    /**
	    * action listener of the zari.
	    */
	private class ZariListener implements ActionListener 
	{

		Zari zariA = paixnidi.A.getZari();
		Zari zariB = paixnidi.B.getZari();
      
		@Override
		public void actionPerformed(ActionEvent e)
		{
			// TODO Auto-generated method stub
			if (e.getActionCommand()!=null) {
				if (e.getSource() == btnZaria_1 && (paixnidi.B.getCanTake())) 
				{
					
					refreshZariNum("B", zariB.rollDice());
					btnZaria_1.setEnabled(false);
					if (paixnidi.tablo[paixnidi.B.getPos()] instanceof YardSalePos) 
					{
						
						YardSalePos y = (YardSalePos) paixnidi.tablo[paixnidi.B.getPos()];
						DealCard c = paixnidi.DealCard.removeCard();
						y.ActivityOfPos(paixnidi.B, zariB.getNumZari(), c);
						showDealCard("", c);
						updatePlayersInfo();
						refreshinfobox("the player " + paixnidi.B.getName() + " bought the card for "
								+ zariB.getNumZari() * 100);
						paixnidi.B.setCanTake(false);
					}

					if (paixnidi.tablo[paixnidi.B.getPos()] instanceof SweepstakesPos) 
					{
						
						SweepstakesPos s = (SweepstakesPos) paixnidi.tablo[paixnidi.B.getPos()];
						s.ActivityOfPos(paixnidi.B, zariB.getNumZari());
						updatePlayersInfo();

						refreshinfobox(
								"the player "+paixnidi.B.getName()+" won "+zariB.getNumZari() * 1000 + " E");
						paixnidi.B.setCanTake(false);
					}
				} 
				else if (e.getSource() == btnZaria && (paixnidi.A.getCanTake()))
				{
					
					refreshZariNum("A", zariA.rollDice());
					btnZaria.setEnabled(false);
					if (paixnidi.tablo[paixnidi.A.getPos()] instanceof YardSalePos) 
					{
						
						YardSalePos y = (YardSalePos) paixnidi.tablo[paixnidi.A.getPos()];
						DealCard c = paixnidi.DealCard.removeCard();
						y.ActivityOfPos(paixnidi.A, zariA.getNumZari(), c);
						showDealCard("", c);
						updatePlayersInfo();
						refreshinfobox("the player " + 
						paixnidi.A.getName() + " bought the card for "
								+ zariA.getNumZari() * 100);
						paixnidi.A.setCanTake(false);
					}

					if (paixnidi.tablo[paixnidi.A.getPos()] instanceof SweepstakesPos)
					{
						
						SweepstakesPos s = (SweepstakesPos) paixnidi.tablo[paixnidi.A.getPos()];
						s.ActivityOfPos(paixnidi.A, zariA.getNumZari());
						updatePlayersInfo();

						refreshinfobox(
								"the player " + paixnidi.A.getName() + " won " + zariA.getNumZari() * 1000 + " E");
						paixnidi.A.setCanTake(false);
					}
				}
				else if (RadioPos)
				{
					
					if (e.getSource() == btnZaria) 
					{
						refreshZariNum("A", zariA.rollDice());
						btnZaria.setEnabled(false);
					}
					else
					{
						refreshZariNum("B", zariB.rollDice());
						btnZaria_1.setEnabled(false);
					}

					if (zariA.getRoll() && zariB.getRoll())
					{

						if (zariA.getNumZari() == zariB.getNumZari())
						{
							zariA.setRoll(false);
							btnZaria.setEnabled(true);
							btnZaria_1.setEnabled(true);
							zariB.setRoll(false);
						} else
						{
							if (zariB.getNumZari() > zariA.getNumZari())
							{

								paixnidi.B.setLefta(1000);
								updatePlayersInfo();
								refreshinfobox("the player " + paixnidi.B.getName() + " won 1000 euros from radio!");
							}

							else
							{

								paixnidi.A.setLefta(1000);
								updatePlayersInfo();
								refreshinfobox("the player " + paixnidi.A.getName() + " won 1000 euros from radio!");
							}
							RadioPos = false;// ksana bazw thn timh false gia na allaksei se kapoia allh synarthsh mas .(na
							// ginei true kai na ksanakanw aytes tis energeies)
						}
					}
					
				}
				else if (LotteryPos) 
				{
					
					if (e.getSource() == btnZaria_1)
					{
						refreshZariNum("B", zariB.rollDice());
						btnZaria_1.setEnabled(false);
						
						if (zariB.getNumZari() == lotteryB) 
						{

							paixnidi.B.setLefta(1000);
							updatePlayersInfo();
							refreshinfobox("the player " + paixnidi.B.getName() + " won 1000 euros from lottery!");
							LotteryPos = false;

						}else 
						{
							btnZaria.setEnabled(true);
						}
					}
					
					else 
					{
						refreshZariNum("A", zariA.rollDice());
						btnZaria.setEnabled(false);
						if (lotteryA == zariA.getNumZari()) 
						{
							paixnidi.A.setLefta(1000);
							updatePlayersInfo();
							refreshinfobox("the player " + paixnidi.A.getName() + " won 1000 euros from lottery!");
							LotteryPos = false;
						}else
						{
							btnZaria_1.setEnabled(true);
						}
						
					}
				} 
				else
				{
					movePlayer(e);
				}
			}
		}

	}
	    
	    /**
	     *Depending on the zari number the player changes position sto tablo.
	     * @param e the action event taken from the ZariListener
	     */
	  public void movePlayer(ActionEvent e) {
	    	 Zari z1 = paixnidi.A.getZari();
	    	 Zari z2 = paixnidi.B.getZari();
		if (e.getSource() == btnZaria) 
		{
			refreshZariNum("A", z1.rollDice());
			if (z1.getRoll())
			{
				btnZaria.setEnabled(false);
				if (paixnidi.start) 
				{
					if (z1.getNumZari()==6) 
					{
						paixnidi.WinJack(paixnidi.A);
						paixnidi.jackpot.setJackVal(-paixnidi.jackpot.getJackVal());
						jackf.setText(paixnidi.jackpot.getJackVal() + " Euro");
						updatePlayersInfo();
					}
					if (paixnidi.A.getPos()==0)
					{
						pioniPos[31].removeAll();
						pioniPos[31].repaint();
					}
					
					pioniPos[paixnidi.A.getPos()].removeAll();
					if (paixnidi.A.getPos() == paixnidi.B.getPos())
					{
						updatePioniPosition("B", paixnidi.B.getPos());
					}
					pioniPos[paixnidi.A.getPos()].repaint();
					paixnidi.A.setPos(z1.getNumZari());
					updatePioniPosition("A", paixnidi.A.getPos());
					
					ActionsByPosition(paixnidi.A, paixnidi.A.getPos());
					 
				}
			}
		}else 
		{
		             refreshZariNum("B",z2.rollDice());
		             if (z2.getRoll())
		             {
		                 btnZaria_1.setEnabled(false);
		                 if (paixnidi.start)
		                 {
		                     if (z2.getNumZari() == 6)
		                     {
		                         paixnidi.WinJack(paixnidi.B);
		                         paixnidi.jackpot.setJackVal(-paixnidi.jackpot.getJackVal());
		                         jackf.setText(paixnidi.jackpot.getJackVal()+" Euro");
		                         updatePlayersInfo();
		                     }
		                     if (paixnidi.B.getPos()== 0) 
		                     {
		                         pioniPos[31].removeAll();
		                         pioniPos[31].repaint();
		                     }
		                     pioniPos[paixnidi.B.getPos()].removeAll();
		                     if (paixnidi.B.getPos() == paixnidi.A.getPos()) 
		                     {
		                    	 updatePioniPosition("A",paixnidi.A.getPos());
		                     }
		                     pioniPos[paixnidi.B.getPos()].repaint();
		                     paixnidi.B.setPos(z2.getNumZari());
		                     updatePioniPosition("B",paixnidi.B.getPos());
		                     
		                     ActionsByPosition(paixnidi.B, paixnidi.B.getPos());
		                     
		                 }
		             }
		}PickFirstPlayer() ; 
	  }
	     
	     /**
	      * This method does the following:let the player throw the dice and the player with the bigger number will play first.
	      */
	     public void PickFirstPlayer()
	     {
	    	 Zari z1 = paixnidi.A.getZari();
	    	 Zari z2 = paixnidi.B.getZari();
	    	 
	    	 if ( z2.getRoll()&&z1.getRoll() && !paixnidi.B.getTurn()&& !paixnidi.A.getTurn() ) 
	    	 {
	             if(z1.getNumZari()==z2.getNumZari())
	             {
	            	 z1.setRoll(false);
	            	 z2.setRoll(false);
	            	 btnZaria.setEnabled(true);
	            	 btnZaria_1.setEnabled(true);
	            	 
	 
	             }else
	             {
	            	 paixnidi.FirstPlayer(z1.getNumZari(), z2.getNumZari());
	            	 btnmessagecard.setEnabled(true);
	            	 btnDealcard.setEnabled(true);
	                paixnidi.start=true;
	                
	                refreshinfobox(" >>");
	                if(paixnidi.A.getTurn()) 
	                {
	                	btnZaria.setEnabled(true);
	                }
	                else 
	                {
	                	btnZaria_1.setEnabled(true);
	                }
	                
	                z1.setRoll(false);
	                z2.setRoll(false);
	     
	             }
	         }
	    	 
	     }
	     
	     /**
	      * the positions of the player make some actions and with this method we will update the graphics done by these actions
	      * @param player Player on the position 
	      * @param position is the  number of the position
	      */
	     private void ActionsByPosition(Player player, int position) {
	    	 
	    	 if( (paixnidi.tablo[paixnidi.A.getPos()] instanceof RadioPos && paixnidi.A.getTurn() ) ||
	    			 (paixnidi.tablo[paixnidi.B.getPos()] instanceof RadioPos && paixnidi.B.getTurn() )) 
	    	 {
	    		
	    		 RadioPos = true;
	    		 btnZaria.setEnabled(true);
	    		 btnZaria_1.setEnabled(true);
	    		 refreshinfobox("Throw the dices!");
	    		 paixnidi.A.getZari().setRoll(false);
	    		 paixnidi.B.getZari().setRoll(false);
	    	 }
	    	
	    	  if(paixnidi.tablo[position] instanceof DealPosition){
	    		 refreshinfobox("Draw a deal card");
	    		 player.setCanTake(true);
	    	 }
	    	  if(paixnidi.tablo[position] instanceof PayDayPos)
	    	 {
	    	 	 PayDayPos p= (PayDayPos) paixnidi.tablo[position];
	    		 
	    		 if(player.getLoan()!=0)
	    		 {
	    			 payday pa= new payday();
	    			 p.ActivityOfPos(player, pa.getChoice());
	    			
	    		 }else
	    		 {
	    			 p.ActivityOfPos(player, -55);//akyro noymero wste na mhn isxyei kamia if sto activityofpos
	    		 }
	    		 paixnidi.lastCards(player);
	    		 
	    		 if(paixnidi.GameF()) 
	    		 {
	    			 String str;
	    			 str= paixnidi.getWinner();
	    			 refreshinfobox("Player A :"+paixnidi.numA+", Player B:"+paixnidi.numB+"/ Winner:"+str);
	    			 updatePlayersInfo();
	    		 }
	    		 updatePlayersInfo();
	    	 }
	    	 
	    	  if(paixnidi.tablo[position] instanceof messagePos) 
	    	 {
	    		 messagePos m= (messagePos) paixnidi.tablo[position];
	    		 if(m.getCardGot()) 
	    		 {
	    			 refreshinfobox(player.getName() +" draw 1 message card");
	    		 }else 
	    		 {
	    			 refreshinfobox(player.getName() +" draw 2  message cards");
	    		 }
	    		 player.setCanTake(true);
	    	 }
	    	 
	    	 if(paixnidi.tablo[position] instanceof BuyerPosition)
	    	 {
	    		 
	    		 if(player.isEmptyOfCards())
	    		 {
	    			 player.setCanTake(false);
	    			 refreshinfobox(player.getName() +" does not have any card to sell!");
	    		 }else 
	    		 {
	    			 refreshinfobox(player.getName() +" sell one card!");
	    			 
	    			 
	    			 player.setCanTake(true);
	    		 }
	    	 }
	    	 if(paixnidi.tablo[position] instanceof SweepstakesPos ||
	    			 paixnidi.tablo[position] instanceof YardSalePos) 
	    	 {
	    		
	    		 player.setCanTake(true);
	    		 refreshinfobox("Throw the dice one more time!");
	    		 if  (player.getName().equals("B")) 
	    		 {
	    			 btnZaria_1.setEnabled(true);
	    		 }
	    		 else
	    		 {
	    			 btnZaria.setEnabled(true);
	    		 }
	    	 }
	    	 
	    	 if(paixnidi.tablo[position] instanceof FamilyPos) 
	    	 {
	    		 FamilyPos f = (FamilyPos)paixnidi.tablo[position];
	    		 if(f.ActivityOfPos(player,paixnidi.jackpot)) 
	    		 {
	    			 refreshinfobox("The player "+player.getName()+" won 500 in casino");
	    			 updatePlayersInfo();
	    		 }else 
	    		 {
	    			 refreshinfobox("The player "+player.getName()+" lost 500 in casino");
	    			 jackf.setText(paixnidi.jackpot.getJackVal()+" Euro");
	    			 updatePlayersInfo();
	    		 }
	    	 }
	    	 if( (paixnidi.tablo[paixnidi.A.getPos()] instanceof LotteryPos && paixnidi.A.getTurn() ) ||(paixnidi.tablo[paixnidi.B.getPos()] instanceof LotteryPos && paixnidi.B.getTurn() )) 
	    	 {
	    		
	    		 ArrayList<Object> o = new ArrayList();
	    		 LotteryPos = true;
	             o.add("1");
	             o.add("2");
	             o.add("3");
	             o.add("4");
	             o.add("5");
	             o.add("6");
	             lottery l = new lottery(paixnidi.A,o);
	             lotteryA=Integer.parseInt(l.getOption());
	             o.remove(lotteryA-1);//wste na mhn epileksoyn ton idio arithmo
	             lottery l1 = new lottery(paixnidi.B,o);
	             lotteryB=Integer.parseInt(l1.getOption());
	             
	             refreshinfobox("PLAYER A :"+lotteryA+" Player B: "+lotteryB);
	             
	             if(paixnidi.A.getTurn())
	             {
	            	 btnZaria.setEnabled(true);
	            	 paixnidi.A.getZari().setRoll(false);
	             }
	             if(paixnidi.B.getTurn())
	             {
	            	 btnZaria_1.setEnabled(true);
	            	 paixnidi.B.getZari().setRoll(false);
	             }
	    	 }
	    	 
	     }
	     
	     /**
	      * show DealCard,will put code from given code.
	      * @param l the string message
	      * @param c the dealcard
	      * @return an integer
	      */
	     public int showDealCard(String l,DealCard c) 
	     {
	    	 String[] options = {"Buy", "Ignore"};
	    	 
	    	 String[] o2= {"OK"};
	    	 int n;
	 		URL imageURL = classld.getResource("resources/images/" + c.getImageUrl()); 
	 		
	 		Image image = new ImageIcon(imageURL).getImage();
	 		image = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	 		JOptionPane p = new JOptionPane();
	 		
	 		if( l.equals("show")) 
	 		{
	 		 n = p.showOptionDialog(this,c.getMessage() + "\nPurchase Price: " +c.getMoney() +
	 				"\nSale Price: " + c.getSellCost()+"\n","DealCard",
	 				JOptionPane.OK_OPTION,
	 				0,
	 				new ImageIcon(image),
	 				options,
	 				options[0]);
	        }else 
	        {
	        	 n = p.showOptionDialog(this,c.getMessage() + "\nPurchase Price: " +c.getMoney() +
		 				"\nSale Price: " + c.getSellCost()+"\n","DealCard",
		 				JOptionPane.OK_OPTION,
		 				0,
		 				new ImageIcon(image),
		 				o2,
		 				o2[0]);
	        }
	     return n;
	     }
	     /**
	      * show messageCard,will put code from already given code.
	      * @param c the messageCard
	      */
	     public void showMailCard(Card c) {
	    	 String t = "";
	         String t1 = "";
	 		URL imageURL = classld.getResource("resources/images/" + c.getImageUrl()); 
	 		Image image = new ImageIcon(imageURL).getImage();
	 		image = image.getScaledInstance(200, 200, java.awt.Image.SCALE_SMOOTH);
	 		
	 		JOptionPane p = new JOptionPane();
	 		
	 		if (c instanceof PayTheNeigh)
	 		{
	            t= "Pay the neighbor";
	            t1 =" Pay " + c.getMoney() + " Euro to the opponent";
	 		}
	 		if (c instanceof GetMoneyFromNeigh) 
	 		{
	 			 t= "Get money from neighbor";
		            t1 = "Get " + c.getMoney() + " from the neighbor";
	        } 
	 		if (c instanceof CharityCard)
	 		{
	 			 t= "Charity";
		         t1 = "Πληρωσε " + c.getMoney() + " euros to the Jackpot";
	        } 
	 		if (c instanceof BillCard)
	 		{
	 			 t= "Bill Payment";
		            t1 = "Keep the bill";
	        } 
	 		if (c instanceof moveToBuyerOrDeal) 
	 		{
	 			 t= "Move to Deal/Buyer Position";
		            t1 = "ok";
	        } 
 		 if (c instanceof AdvertisementCard)
 		{
 			 t= "Advertisement";
 		            t1 = "Sell it for "+c.getMoney();
         }	 		
	 		
	 		Object[]  o= {t1};
	 		int n = p.showOptionDialog(this,
	 				c.getMessage(),t,
	 				JOptionPane.OK_OPTION,
	 				0,
	 				new ImageIcon(image),
	 				o,o[0]);
	 		
	
	     }
	     
	     /**
	      * this method refreshes the number of the player's zari.
	      * @param onomapaikti  is the player who rolled the dice
	      * @param num represents the dice number.
	      */
	     public void refreshZariNum(String onomapaikti,int num) {
	    	 if(onomapaikti.equals("A")) 
	    	 {
	    		 btnZaria.setIcon(new ImageIcon(new ImageIcon("src/resources/images/dice-"+ num+ ".jpg").getImage().getScaledInstance(btnZaria.getWidth(),btnZaria.getHeight() ,
	    				 Image.SCALE_DEFAULT)));
	    	 }
	    	 if(onomapaikti.equals("B")) 
	    	 {
	    		 btnZaria_1.setIcon(new ImageIcon(new ImageIcon("src/resources/images/dice-"+ num+ ".jpg").getImage().getScaledInstance(btnZaria_1.getWidth(),btnZaria_1.getHeight() ,
	    				 Image.SCALE_DEFAULT)));
	    	 }
	     }
	     
	     /**
	      * Updates the componenents of info box such as who has turn, the action must take etc.
	      * @param cmd the string command
	      */
	     public void refreshinfobox( String cmd) {
	    	 		
	 		txtMonthsremain.setText(paixnidi.info_box()[0]);
	 	
	 		txtTurn.setText(paixnidi.info_box()[1]);
	 		
	 	
	 		textField_3.setText(cmd);
	     }
	     
	     
	     
	     /**
	      * this method updates the position ofthe player's pawn by num + positions.
	      * @param p1  is the player that will change position
	      * @param number is the position the pioni will go
	      */
	     public void updatePioniPosition(String p1,int number) {
	      
	    	 JLabel    pioni = new JLabel();

	         if (p1.equals("A")) 
	         {
	            
	             pioni.setIcon(new ImageIcon(new ImageIcon("src/resources/images/pawn_yellow.png").getImage().getScaledInstance(45,50 , Image.SCALE_DEFAULT)));
	         } 
	         
	         if(p1.equals("B"))
	         {
	        	 pioni.setIcon(new ImageIcon(new ImageIcon("src/resources/images/pawn_blue.png").getImage().getScaledInstance(45,50 , Image.SCALE_DEFAULT)));
	         }
	         
	         pioniPos[number].add(pioni);
	         Graphics graph=position[number].getGraphics();
	         position[number].paintComponents(graph);
	         position[number].repaint();
	     }
	     
	     /**
	      * a new loan dialog will be thrown on the screen and the player will choose the loan he /she wants.\
	      * @param p1 is the player will get the loan.
	      */
	     
	     public void getLoan(Player p1) {
	    	 loan l = new loan();
	    	 if(Integer.parseInt(l.getloan())!=0)
	    	 {
	    		 p1.setLoan(Integer.parseInt(l.getloan()));
	    		 p1.setLefta(Integer.parseInt(l.getloan()));
	    		 updatePlayersInfo();
	    		 refreshinfobox("The player "+ p1.getName()+" took "+Integer.parseInt(l.getloan())+" loan!");
	    		 
	    	 }
	     }
	     
	     /**
	      * this method updates the player deal cards,adds or removes from the dealcard list.
	      * @param p1 the player we change the dealcard list
	      */
	     public void updateDeal(Player p1) {
	    	 if(p1.getCanTake() && !p1.isEmptyOfCards()) {
	    		 DealCard c = p1.sellmyDeal();
	    		 showDealCard("sell", c);
	    		 p1.setCanTake(false);
	    		 p1.setLefta(c.getSellCost());
	    		 
	    		 paixnidi.Pile.AddToCardPile(c);
	    		 updatePlayersInfo();
	    		 refreshinfobox("The player "+ p1.getName()+" sold the card!");
	    		 
	    		 
	    		 
	    	 }
	     }
	     
	     
	     /**
	      * this method updates the player's textfields in view class
	      */
	     public void updatePlayersInfo() {
	    	 textField_1.setText("Loan: " +paixnidi.B.getLoan() + " Euro");
	         txtBilla.setText("Bills: " +paixnidi.A.getBill() +" Euro");
	         textField_2.setText("Bills: " +paixnidi.B.getBill() + " Euro");
	    	 txtMoneya.setText("Money: "+paixnidi.A.getLefta()+ " Euro");
	         textField.setText("Money: " +paixnidi.B.getLefta() + " Euro");
	         txtLoana.setText("Loan: " +paixnidi.A.getLoan()+" Euro");
	         
	     }
}
