package view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author gnnss
 *
 */
public class payday {

	Image image;
	int choice;
	
	/**
	 * <b>constructor</b> constructs a new payday dialog
	 * in this dialog the player will decide if he pays his loans ,not pay ,or pay one part.
	 */
	public payday() {
		JFrame frame = new JFrame();
		image = new ImageIcon("src/resources/images/logo.png").getImage().getScaledInstance(130, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon m ;
		m = conv(image);
		 Object[] num = {"YES","NO","PART OF IT"};
		 choice =  JOptionPane.showOptionDialog(frame, "Do you want to pay your loans?", "BANK OF GREECE",
				 JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, m, num, num[0]);
	}
	
	/**
	 * <b>accessor</b>
	 * @return the choice of the player.
	 */
	public int  getChoice() {
		return choice;
	}
	
	public static ImageIcon conv(Image im) {
		return new ImageIcon(im);
	}
}
