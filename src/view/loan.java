package view;

import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * 
 * @author gnnss
 *
 */
public class loan {
	String loan;
	Image image;
	ClassLoader classld = this.getClass().getClassLoader();
	/**
	 * <b>constructor</b> constructs a new loan dialog.
	 * postcondition:creates a new loan dialog
	 */
	public loan() {
		JFrame frame = new JFrame();
		image = new ImageIcon("src/resources/images/daneio.JPG").getImage().getScaledInstance(130, 100, java.awt.Image.SCALE_SMOOTH);
		ImageIcon m ;
		m = conv(image);
		 String[] loanmoney = {"1000","2000","3000","4000","5000","6000","7000","8000","9000", "10000","11000","12000","13000","14000","15000","20000"};
		 
		 loan = (String) JOptionPane.showInputDialog(frame, "Pick the loan you want",
				 "Loan from Bank", JOptionPane.PLAIN_MESSAGE, m, loanmoney, loanmoney[0]);
		
	}
	
	/**
	 * <b>accessor</b>
	 * @return the loan choice of the player.
	 */
	public String getloan() {
		if (loan == null) return "0";
        else  return loan;
	}
	
	public static ImageIcon conv(Image im) {
		return new ImageIcon(im);
	}

}
