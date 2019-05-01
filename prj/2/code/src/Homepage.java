import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.beans.PropertyChangeListener;
import java.util.Date;
import java.util.List;
import java.beans.PropertyChangeEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.SpringLayout;

public class Homepage {

	JFrame frame;
	 User cUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			
		

			//public User cUser = window.Login.getUser();

			public void run() {
				try {
					Homepage window = new Homepage(cUser);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Homepage(User cUser) {
		this.cUser = cUser;
		initialize(cUser);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(User cUser) {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setBackground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 448, 303);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(User.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		
		JLabel lblNewLabel = new JLabel("Welcome back " + cUser.getUsername().toString());
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent evt) {
			
			}
		});
		SpringLayout springLayout = new SpringLayout();
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 43, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 86, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().setLayout(springLayout);
		frame.getContentPane().add(lblNewLabel);
		JButton btnViewPastWorkouts = new JButton("My Workouts");
		springLayout.putConstraint(SpringLayout.NORTH, btnViewPastWorkouts, 194, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnViewPastWorkouts, 12, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnViewPastWorkouts, 219, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnViewPastWorkouts, 119, SpringLayout.WEST, frame.getContentPane());
		btnViewPastWorkouts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				PrevWorkouts pW = new PrevWorkouts(cUser);
				pW.frame.setVisible(true);
			}
		});
		frame.getContentPane().add(btnViewPastWorkouts);
		
		JButton btnMyBest = new JButton("My Best");
		springLayout.putConstraint(SpringLayout.NORTH, btnMyBest, 162, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnMyBest, 12, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnMyBest, 187, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnMyBest, 109, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(btnMyBest);
		
		JButton btnTrackNewWorkout = new JButton("Track New Workout");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -24, SpringLayout.NORTH, btnTrackNewWorkout);
		btnTrackNewWorkout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			SessionFactory fWorkout = new Configuration()
					.configure()
					.addAnnotatedClass(Workout.class)
					.buildSessionFactory();
			//create session
			Session sessionW = fWorkout.getCurrentSession();
			sessionW.beginTransaction();
			Workout nWorkout = new Workout(new Date(),cUser.getId());
			sessionW.save(nWorkout);
			sessionW.getTransaction().commit();
			sessionW.close();
			Tracker track = new Tracker(cUser, nWorkout);
			frame.setVisible(false);
			track.frame.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnTrackNewWorkout, 83, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnTrackNewWorkout, 142, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, btnTrackNewWorkout, 141, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnTrackNewWorkout, 302, SpringLayout.WEST, frame.getContentPane());
		btnTrackNewWorkout.setForeground(Color.WHITE);
		btnTrackNewWorkout.setBackground(Color.BLACK);
		frame.getContentPane().add(btnTrackNewWorkout);
		
		JList list = new JList();
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -56, SpringLayout.EAST, list);
		springLayout.putConstraint(SpringLayout.NORTH, list, 232, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, list, 301, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, list, 146, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, list, 390, SpringLayout.WEST, frame.getContentPane());
		frame.getContentPane().add(list);
		
		JButton btnRecordInjury = new JButton("Record Injury");
		btnRecordInjury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Injury Inj = new Injury(cUser);
				frame.setVisible(false);
				Inj.frame.setVisible(true);
				
			}
		});
		springLayout.putConstraint(SpringLayout.NORTH, btnRecordInjury, 195, SpringLayout.NORTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, btnRecordInjury, 273, SpringLayout.WEST, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnRecordInjury, 401, SpringLayout.WEST, frame.getContentPane());
		btnRecordInjury.setBackground(Color.RED);
		frame.getContentPane().add(btnRecordInjury);
		
		JButton btnRemoveInjury = new JButton("remove injury");
		btnRemoveInjury.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				List<User> cUsers = session.createQuery("from User u where u.username='"+ cUser.getUsername() + "'").getResultList();
				User uUser = cUsers.get(0);
				uUser.setInjury(null);
				session.update(uUser);
				session.getTransaction().commit();
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnRemoveInjury, 0, SpringLayout.SOUTH, btnMyBest);
		springLayout.putConstraint(SpringLayout.EAST, btnRemoveInjury, -47, SpringLayout.EAST, frame.getContentPane());
		frame.getContentPane().add(btnRemoveInjury);
		
		JButton btnNewButton = new JButton("Submit new Exercise");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			SubmitWorkout sWorkout = new SubmitWorkout();
			frame.setVisible(false);
			sWorkout.frame.setVisible(true);
			}
		});
		springLayout.putConstraint(SpringLayout.SOUTH, btnNewButton, -35, SpringLayout.SOUTH, frame.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btnNewButton, -6, SpringLayout.WEST, btnRecordInjury);
		frame.getContentPane().add(btnNewButton);
	}
}
