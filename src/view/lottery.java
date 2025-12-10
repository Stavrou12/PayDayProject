package view;

import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Player.Player;

/**
 * 
 * @author gnnss
 *
 */
public class lottery {

	String option;
	Image image;
	ClassLoader classld = this.getClass().getClassLoader();
	
	/**
	 * <b>constructor</b>
	 * this method offers the choice of the player (choice == number of dice that will be rolled) 
	 * @param p1 represents the Player on the lottery position.
	 * @param numchoice dice number
	 */
	public lottery(Player p1,ArrayList numchoice) {
		JFrame frame = new JFrame();
		image = new ImageIcon("src/resources/images/lottery.png").getImage().getScaledInstance(130, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon m ;
		m = conv(image);
		
			Object[] s = numchoice.toArray();
		 option = (String) JOptionPane.showInputDialog(frame, "Choose the number", p1.getName()+" player picks",
				 JOptionPane.PLAIN_MESSAGE, m, s, s[0]);
	}
	
	/**
	 * <b>accessor</b>
	 * @return the player's choice of number of the dice 
	 */
	public String getOption() {
		 return option;
		
	}
	public static ImageIcon conv(Image im) {
		return new ImageIcon(im);
	}
	
}
