package Basic_SignIn_Temp;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI_ResetPassword extends JFrame implements ActionListener {

	private JLabel lbl1,lbl2;
	private JTextField txt;
	private JButton btn;
	private JPanel pnl;
	
	public GUI_ResetPassword() {
		super("Reset your password");
		setLayout(null);
		
		pnl = new JPanel(new GridLayout(4,1));
		pnl.setBounds(50,50,300,220);
		add(pnl);
		
		lbl1 = new JLabel("<html>Please enter your email address.<br>We'll send you a link to reset your password.</html>");
        lbl1.setFont(new Font("Arial", Font.BOLD, 16));
		lbl1.setForeground(Color.BLUE);
		lbl1.setOpaque(true);
        pnl.add(lbl1);
		
		lbl2 = new JLabel("E-mail");
		pnl.add(lbl2);
		
		txt = new JTextField();
		pnl.add(txt);
		
		btn = new JButton("Reset password");
		btn.setForeground(Color.green);
		btn.setFont(new Font("Arial",Font.BOLD,22));
		btn.addActionListener(this);
		pnl.add(btn);
		
		setVisible(true);
		setSize(400,400);	
		setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new GUI_ResetPassword();
}
	@Override
	public void actionPerformed(ActionEvent e) {
		String email = txt.getText();
		String message = email.substring(0, email.length()/4);
		if(e.getSource()==btn) {
			JOptionPane.showMessageDialog(null, "An email was just sent to "+message+"***", 
					"Information", JOptionPane.INFORMATION_MESSAGE);

		}
			
		
	}

}
