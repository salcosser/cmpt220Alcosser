import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import javax.swing.JFrame;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.awt.Color;
import javax.swing.JList;

public class Metrics {

    JFrame frame;
	User cUser;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metrics window = new Metrics();
					window.frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Metrics(User cUser) {
		this.cUser = cUser;
		initialize(cUser);
	}
	
	public int getIndexOfLargest( int[] array )
	{
	if(array.length == 1){
		return array[0];
	}
	int currMax = 0;
	 for(int h = 0;h<array.length;h++) {
		 if(array[h] > array[currMax]) {
			 currMax = h;
		 }

	 }
	 	System.out.println("currmax val: " + array[currMax] + "currMax ind: " + currMax);
		return currMax;
		
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(User cUser) {
		
		
		
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 191, 255));
		frame.getContentPane().setLayout(null);
		
		
		SessionFactory factoryExerciseDone = new Configuration()
				.configure()
				.addAnnotatedClass(exerciseDone.class)
				.buildSessionFactory();
		//create session
		Session sessionED = factoryExerciseDone.getCurrentSession();
		sessionED.beginTransaction();
		
		SessionFactory factoryExercises = new Configuration()
				.configure()
				.addAnnotatedClass(exercises.class)
				.buildSessionFactory();
		//create session
		Session sessionE = factoryExercises.getCurrentSession();
		sessionE.beginTransaction();
		
		SessionFactory factoryWO = new Configuration()
				.configure()
				.addAnnotatedClass(Workout.class)
				.buildSessionFactory();
		//create session
		Session sessionWO = factoryWO.getCurrentSession();
		sessionWO.beginTransaction();
		List<exercises> exList = sessionE.createQuery("from exercises").getResultList(); //resources
		List<Workout> wOId = sessionWO.createQuery("from Workout w where w.userId = " + cUser.getId()).getResultList();
		List<exerciseDone> eDones = new ArrayList<>();
		for(int b = 0;b<wOId.size();b++) {
			List<exerciseDone> eDonesW = sessionED.createQuery("from exerciseDone e where e.wO.workoutid = " +wOId.get(b).getWorkoutid()).getResultList();
			for(int a = 0;a<eDonesW.size(); a++) {
				eDones.add(eDonesW.get(a));
			}
		}
		//resources
		ArrayList<exerciseDone> maxesList = new ArrayList<>(); //holding the highest rep count of each exercise
		ArrayList<exerciseDone> currEx = new ArrayList<>(); // holding the distinct exercises as they are compared
		
		for(int i = 0; i<exList.size();i++) { //going through each exercise
			int currE = exList.get(i).getIdExercises(); //getting the PK to compare to 
			
			for(int j = 0;j<eDones.size();j++) { //going through each of the exercises done
				if(eDones.get(j).getExerciseId() == currE) {
					currEx.add(eDones.get(j));
				}
				if(currEx.size() >= 1) {
				int[] mReps = new int[currEx.size()];	//array to hold the total reps of each exercise done
				for(int k = 0; k<currEx.size();k++) {
					mReps[k] = ( (currEx.get(k).getReps())*(currEx.get(k).getSets() )); //computing
				}
				System.out.println(mReps.toString());
				maxesList.add(currEx.get(getIndexOfLargest(mReps)-1));
				}
				currEx.clear();
				
			}
			
		}
		String[] listVersionMax = new String[maxesList.size()];
		for(int n = 0;n<maxesList.size();n++) {
			int exId =  maxesList.get(n).getExerciseId();
			List<exercises> exName = sessionE.createQuery("from exercises e where e.idExercises = " + exId).getResultList();
			listVersionMax[n] = new String(exName.get(n).getName().toString() + " | sets: "  + 
					maxesList.get(n).getSets() + " | reps: " + maxesList.get(n).getReps() + 
					" | weight: " + maxesList.get(n).getWeight()
					);
		}
		JList list = new JList(listVersionMax);
		list.setBounds(63, 55, 95, 141);
		frame.getContentPane().add(list);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
}
