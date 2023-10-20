package Basic_SignIn_Temp;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_SignUp extends JFrame implements ActionListener {

	private JLabel lbl1, lbl2, lbl3, lblPasswordWarning;
	private JTextField txt1;
	private JComboBox bx;
	private JPasswordField pass;
	private JButton btn;
	private JPanel pnl1,pnl2,pnl3,pnl4,pnl5;

	public GUI_SignUp() {
		super("Sign Up");
		setLayout(null);
		
		pnl1 = new JPanel(new GridLayout(2, 1));
		pnl1.setBounds(20, 20, 300, 50);
        add(pnl1);
        
		lbl1 = new JLabel("Username");
		pnl1.add(lbl1);
		
		txt1 = new JTextField();
		pnl1.add(txt1);
		
		pnl2 = new JPanel(new GridLayout(4,1));
		pnl2.setBounds(20,100,300,100);
		add(pnl2);
		
		lbl2 = new JLabel("Date of Birth");
		pnl2.add(lbl2);
		
		JComboBox<String> dayComboBox = new JComboBox<>();
		JComboBox<String> monthComboBox = new JComboBox<>();
		JComboBox<String> yearComboBox = new JComboBox<>();

		for (int i = 1; i <= 31; i++) {
			dayComboBox.addItem(String.valueOf(i));
		}

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		for (String month : months) {
			monthComboBox.addItem(month);
		}

		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int i = currentYear; i >= currentYear - 100; i--) {
			yearComboBox.addItem(String.valueOf(i));
		}

		pnl2.add(dayComboBox);
		pnl2.add(monthComboBox);
		pnl2.add(yearComboBox);

		pnl3 = new JPanel(new GridLayout(2,1));
		pnl3.setBounds(20, 220, 300, 50);
		add(pnl3);
		
		lbl3 = new JLabel("Password");
		pnl3.add(lbl3);
		
		pass = new JPasswordField();
		pnl3.add(pass);
		
		pnl4 = new JPanel(new GridLayout(1,1));
		pnl4.setBounds(20,270,300,50);
		add(pnl4);
		
		pass.addKeyListener(new KeyListener() {

			@Override
			public void keyPressed(KeyEvent e) {

			}

			@Override
			public void keyReleased(KeyEvent e) {
				
				String password = new String(pass.getPassword());
				// regex for password validation
				if (!password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$")) {
					lblPasswordWarning.setVisible(true);
				} else {
					lblPasswordWarning.setVisible(false);
				}
			}

			@Override
			public void keyTyped(KeyEvent e) {
				
			}

		});
		
        lblPasswordWarning = new JLabel("<html>Password must contain at least 1 uppercase,<br>"
				+ " 1 lowercase, and 1 numeric character</html>");
		lblPasswordWarning.setForeground(Color.red);
		lblPasswordWarning.setVisible(false);
		pnl4.add(lblPasswordWarning);
		
		pnl5 = new JPanel(new GridLayout(1,1));
		pnl5.setBounds(20,350,300,50);
		add(pnl5);
		
		btn = new JButton("Sign Up");
		btn.setFont(new Font("Arial",Font.BOLD,22));
        btn.setForeground(Color.green);
        btn.addActionListener(this);
        pnl5.add(btn);

		setVisible(true);
		setSize(350, 480);
		setLocationRelativeTo(null);
      }

	    public static void main(String[] args) {
		new GUI_SignUp();
       }

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btn) {
			JOptionPane.showMessageDialog(null, "You have successfully signed up",
					"Information",JOptionPane.INFORMATION_MESSAGE);
		}

	}

}
