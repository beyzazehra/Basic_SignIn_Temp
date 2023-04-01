package Basic_SignIn_Temp;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI_SignIn extends JFrame implements ActionListener {

    private JLabel headerlbl,lbl1,lbl2;
    private JButton btn1,btn2,btn3;
    private JTextField txt1;
    private JCheckBox box;
    private JPasswordField pass;
    private JPanel pnl1, pnl2, pnl3;

    public GUI_SignIn() {
    	
        super("Sign In Window");
        setLayout(null);
        
        pnl1 = new JPanel(new GridLayout(5,1));
        pnl1.setBounds(50, 50, 300, 230);
        add(pnl1);
        
        headerlbl = new JLabel("Log In");
        headerlbl.setFont(new Font("Arial", Font.BOLD, 42));
        pnl1.add(headerlbl);
       
        lbl1 = new JLabel("E-mail");
        pnl1.add(lbl1);
        
        txt1 = new JTextField();
        pnl1.add(txt1);
        
        lbl2 = new JLabel("Password");
        pnl1.add(lbl2);
        
        pass = new JPasswordField();
        pnl1.add(pass);
        
        pnl2 = new JPanel(new GridLayout(1,2));
        pnl2.setBounds(50, 280, 300, 25);
        add(pnl2);
          
        box = new JCheckBox("Remember me");
        pnl2.add(box);
        
        btn1 = new JButton("Forget password?");
        btn1.addActionListener(this);
        btn1.setBorder(BorderFactory.createRaisedBevelBorder());
        pnl2.add(btn1);
        
        pnl3 =  new JPanel(new GridLayout(2,1));
        pnl3.setBounds(50, 350, 300, 100);
        add(pnl3);
        
        btn2 = new JButton("Sign in");
        btn2.setFont(new Font("Arial",Font.BOLD,22));
        btn2.setForeground(Color.green);
        btn2.addActionListener(this);
        pnl3.add(btn2);
        
        btn3 = new JButton("You don't have an account? Sign up!");
        btn3.addActionListener(this);
        btn3.setBorder(BorderFactory.createRaisedBevelBorder());
        pnl3.add(btn3);
        
        setVisible(true);
        setSize(400,520);
        setLocationRelativeTo(null);
     }
        public static void main(String[] args) {
        new GUI_SignIn();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == btn1)
           new GUI_ResetPassword();
        else if (e.getSource() == btn2)
            JOptionPane.showMessageDialog(null, "You have successfully signed in", 
            		"Information", JOptionPane.INFORMATION_MESSAGE);
        else if (e.getSource() == btn3)
            new GUI_SignUp();
    }
}
