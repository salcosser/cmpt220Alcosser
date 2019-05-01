import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.swing.JButton;
import javax.swing.JComboBox;

public class SubmitWorkout {

	JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SubmitWorkout window = new SubmitWorkout();
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
	public SubmitWorkout() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		SessionFactory factory = new Configuration()
				.configure()
				.addAnnotatedClass(exercises.class)
				.buildSessionFactory();
		//create session
		Session session = factory.getCurrentSession();
		
		textField = new JTextField();
		textField.setBounds(107, 102, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSubmitNewExercise = new JLabel("Submit New Exercise");
		lblSubmitNewExercise.setHorizontalAlignment(SwingConstants.CENTER);
		lblSubmitNewExercise.setBounds(126, 21, 168, 14);
		frame.getContentPane().add(lblSubmitNewExercise);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(184, 145, 89, 23);
		frame.getContentPane().add(btnNewButton);
		ArrayList<String> mGroup = session.createQuery("select e.muscle_group from exercises e").getResultList();
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(261, 102, 127, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblExerciseName = new JLabel("Exercise Name");
		lblExerciseName.setHorizontalAlignment(SwingConstants.CENTER);
		lblExerciseName.setBounds(107, 77, 80, 14);
		frame.getContentPane().add(lblExerciseName);
		
		JLabel lblMuscleGroup = new JLabel("Muscle Group");
		lblMuscleGroup.setHorizontalAlignment(SwingConstants.CENTER);
		lblMuscleGroup.setBounds(285, 77, 88, 14);
		frame.getContentPane().add(lblMuscleGroup);
	}
}
