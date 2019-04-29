import java.awt.EventQueue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import javax.swing.JLabel;

public class PrevWorkouts {

	JFrame frame;
	User cUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrevWorkouts window = new PrevWorkouts(cUser);
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
	public PrevWorkouts(User cUser) {
		initialize(cUser);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(User cUser) {
		SessionFactory factoryPrevWorkouts = new Configuration()
				.configure()
				.addAnnotatedClass(Workout.class)
				.buildSessionFactory();
		//create session
		Session sessionPWorkouts = factoryPrevWorkouts.getCurrentSession();
		sessionPWorkouts.beginTransaction();
		List<LocalDate> wOs = sessionPWorkouts.createQuery("from Workout w where w.users_id="+ cUser.getId() + ";").getResultList();
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(112, 128, 144));
		frame.getContentPane().setLayout(null);
		
		JList list = new JList(wOs);
		list.setBounds(35, 46, 318, 134);
		frame.getContentPane().add(list);
		
		JLabel test = new JLabel(cUser.toString());
		test.setBounds(10, 191, 185, 59);
		frame.getContentPane().add(test);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		
	}
}
