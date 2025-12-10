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
public class month {

	Image image;
	String month;
	ClassLoader classld = this.getClass().getClassLoader();
	
	/**
	 * <b>constructor</b> constructs a new month dialog
	 * postcondition: a month dialog is created.
	 * in this dialog we choose how many months(1-3) the game will last
	 */
	public month() {
		JFrame frame = new JFrame();
		image = new ImageIcon("src/resources/images/logo.png").getImage().getScaledInstance(130, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon m ;
		m = conv(image);
		 String[] num = {"1","2","3"};
		 month = (String) JOptionPane.showInputDialog(frame, "Choose the number of month/s", "Month Dialog",
				 JOptionPane.PLAIN_MESSAGE, m, num, num[0]);
	}
	
	/**
	 * <b>accessor</b>
	 * @return months choosen
	 */
	public String getMonth() 
	{
		if(month == null) return 1+"";
		else return month;
	}
	
	public static ImageIcon conv(Image im) {
		return new ImageIcon(im);
	}
}
