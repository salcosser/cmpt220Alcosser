import java.awt.EventQueue;
import org.hibernate.Session;
import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.workoutLogin.hibernate.demo.entity.User;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Toolkit;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;
import javax.swing.JButton;
import javax.persistence.Query;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.List;
import java.awt.Component;
import javax.swing.Box;

public class LogIn {

	public JFrame Login;
	private JTextField username;
	private final Action action = new SwingAction();
	private JPasswordField password;
	User currUser;
	public void setUser(User currUser) {
		this.currUser = currUser;
	}
	public User getUser() {
		return currUser;
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.Login.setVisible(true);
					Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
					Dimension windowSize = window.Login.getSize();

					int windowX = Math.max(0, (screenSize.width  - windowSize.width ) / 2);
					int windowY = Math.max(0, (screenSize.height - windowSize.height) / 2);
					window.Login.setSize(windowX,windowY);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		Login = new JFrame();
		Login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//Login.setUndecorated(true);
		Login.getContentPane().setFont(new Font("Leelawadee", Font.PLAIN, 19));
		Login.getContentPane().setBackground(new Color(135, 206, 235));
		Login.getContentPane().setForeground(Color.WHITE);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setBounds(17, 62, 85, 26);
		lblUsername.setFont(new Font("Leelawadee UI", Font.PLAIN, 19));
		
		username = new JTextField();
		username.setBounds(130, 61, 166, 29);
		username.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(11, 125, 91, 26);
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setBackground(Color.GRAY);
		lblPassword.setFont(new Font("Leelawadee UI", Font.PLAIN, 19));
		
		JLabel lblWorkoutLogin = new JLabel("Workout Login");
		lblWorkoutLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblWorkoutLogin.setBounds(145, 19, 139, 23);
		
		password = new JPasswordField();
		password.setBounds(130, 124, 166, 29);
		
		JButton btnLIn = new JButton("log in");
		btnLIn.setForeground(Color.WHITE);
		btnLIn.setBounds(149, 196, 135, 31);
		btnLIn.setBackground(Color.DARK_GRAY);
		btnLIn.addActionListener(new ActionListener() {
			private String passWord;
			private String userName;
			private User currUser;
			public void actionPerformed(ActionEvent e) {
				String pass = new String(password.getPassword());
				String user = username.getText().toString();
				this.setPassWord(pass);
				this.setUserName(user);
				//create session factory
				SessionFactory factory = new Configuration()
																.configure()
																.addAnnotatedClass(User.class)
																.buildSessionFactory();
			//create session
				Session session = factory.getCurrentSession();
				session.beginTransaction();
				List<User> isReal = session.createQuery("from User u where u.username = '"+ "salcosser4412"+ "'").getResultList(); // should just be user
				//check if there is any user in the database by that username, check if the password matches
				if(isReal.size() >= 1) {
					
					
					Query userS = session.createQuery("from User u where u.username = '"+"salcosser4412"+ "' and u.password =:passw");
					List<User> resolved = userS.setParameter("passw", "password123").getResultList(); // should be pass
					if(resolved.size() ==1) {
						User currUser = resolved.get(0);
						System.out.println(currUser);
						JOptionPane.showMessageDialog(Login, "welcome "+ resolved.get(0).getFullName());
						System.out.println("welcome " + resolved.get(0).getFullName());
						setUser(resolved.get(0));
						Login.setVisible(false);
						Homepage home = new Homepage(resolved.get(0)); //  ***************using testing values, set to open on salcosser4412**************
						home.frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(Login, "Password incorrect.");
						System.out.println("password does not match");
					}
					}
				else {
					JOptionPane.showMessageDialog(Login, "No user found.");
					System.out.println("none found.");
					session.getTransaction().commit();
				}
			}

			private void setPassWord(String pass) {
				// TODO Auto-generated method stub
				this.passWord = pass;
			}
			private void setUserName(String user) {
				this.userName = user;
			}
			public String getUserName() {
				return this.userName;
			}
		});
		btnLIn.setAction(action);
		Login.getContentPane().setLayout(null);
		Login.getContentPane().add(lblUsername);
		Login.getContentPane().add(lblPassword);
		Login.getContentPane().add(lblWorkoutLogin);
		Login.getContentPane().add(password);
		Login.getContentPane().add(username);
		Login.getContentPane().add(btnLIn);
		
		JButton btnNewUser = new JButton("New User");
		btnNewUser.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Login.setVisible(false);
				SignUp sign = new SignUp();
				sign.frame.setVisible(true);
			}
		});
		btnNewUser.setBounds(166, 166, 97, 25);
		Login.getContentPane().add(btnNewUser);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Login");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}


}
