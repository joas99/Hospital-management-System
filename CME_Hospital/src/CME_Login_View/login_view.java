package CME_Login_View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Canvas;
import keeptoo.KGradientPanel;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class login_view extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login_view frame = new login_view(); 
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/* CREATING A EVENT TO ALLOW THE SHIFTING FROM ONE FIELD TO ANOTHER BY CLICKING THE "-- ENTER-KEY --"
	private void jTextFieldKeyPressed(java.awt.event.KeyEvent evt) {
		if(evt.getKeyCode()==KeyEvent.VK_ENTER)
			JPasswordField.requestFocus();
		
			
	}
	*/
	
	
	/**
	 *
	 * Create the frame.
	 */
	public login_view() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1104, 631);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(153, 102, 102));
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KGradientPanel gradientPanel = new KGradientPanel();
		gradientPanel.kStartColor = new Color(204, 0, 153);
		gradientPanel.setkStartColor(new Color(204, 0, 153));
		gradientPanel.setkEndColor(new Color(51, 255, 153));
		gradientPanel.setBounds(10, 11, 1068, 570);
		contentPane.add(gradientPanel);
		gradientPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(498, 76, 534, 466);
		panel.setBackground(new Color(0,0,0,80));
		gradientPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblUserName = new JLabel("User name:");
		lblUserName.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblUserName.setBounds(25, 78, 116, 33);
		panel.add(lblUserName);
		
		JLabel lblPassword = new JLabel("PassWord:");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblPassword.setBounds(25, 189, 102, 33);
		panel.add(lblPassword);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(165, 74, 347, 44);
		
		panel.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.BOLD, 18));
		passwordField.setBounds(165, 185, 347, 44);
		panel.add(passwordField);
		
		JButton btnCancel = new JButton("Sign up");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnCancel.setBackground(new Color(51, 255, 153));
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCancel.setBounds(93, 297, 116, 33); 
		
		panel.add(btnCancel);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = passwordField.getText();
				
				
				if(( username.contains("user") && password.contains("admin")) || (username.contains("admin") && password.contains("1234"))|| 
					username.contains("dalton99") && password.contains("1234567") || username.contains("styve") && password.contains("    ")) {
					
					JOptionPane.showMessageDialog(null, "Logged in successfull","LOgin message",JOptionPane.INFORMATION_MESSAGE);
					textField.setText(null);
					passwordField.setText(null); 
					
					
				}
				else{
					JOptionPane.showMessageDialog(null,"Incorrect Username or Password ", "Login error",JOptionPane.ERROR_MESSAGE);
					textField.setText(null);
					passwordField.setText(null);
					
				}
				
				
				
			}
		});
		btnLogin.setBackground(new Color(204, 51, 255));
		btnLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnLogin.setBounds(340, 297, 107, 33);
		panel.add(btnLogin);
		
		JLabel lblNewLabel = new JLabel("        Sign In");
		lblNewLabel.setFont(new Font("Budmo Jiggler", Font.BOLD, 21));
		lblNewLabel.setBounds(659, 11, 219, 60);
		gradientPanel.add(lblNewLabel);
		
		KGradientPanel gradientPanel_1 = new KGradientPanel();
		gradientPanel_1.setkEndColor(new Color(255, 51, 153));
		gradientPanel_1.kEndColor = new Color(51, 0, 255);
		gradientPanel_1.setBounds(0, 0, 426, 570);
		gradientPanel.add(gradientPanel_1);
		gradientPanel_1.setLayout(null);
		
		JLabel lblHosptital = new JLabel("Hosptital");
		lblHosptital.setForeground(Color.WHITE);
		lblHosptital.setFont(new Font("Hobo Std", Font.BOLD, 32));
		lblHosptital.setBounds(62, 121, 137, 103);
		gradientPanel_1.add(lblHosptital);
		
		JLabel lblGeeks = new JLabel("Geeks");
		lblGeeks.setForeground(Color.WHITE);
		lblGeeks.setFont(new Font("Hobo Std", Font.BOLD, 32));
		lblGeeks.setBounds(112, 34, 128, 103);
		gradientPanel_1.add(lblGeeks);
		
		JLabel lblXcx = new JLabel("XCX");
		lblXcx.setForeground(Color.WHITE);
		lblXcx.setFont(new Font("Hobo Std", Font.BOLD, 32));
		lblXcx.setBounds(140, 79, 128, 103);
		gradientPanel_1.add(lblXcx);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Joas\\Documents\\images (2).png"));
		lblNewLabel_1.setBounds(72, 218, 271, 234);
		gradientPanel_1.add(lblNewLabel_1);
	}
}
