import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * A graphical simulation of an automatic teller machine
 */
public class ATMViewer {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ATM theATM;

		Bank theBank = new Bank();
		theATM = new ATM(theBank);

		JFrame frame = new ATMFrame(theATM);
		frame.setTitle("First National Bank of Java");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
