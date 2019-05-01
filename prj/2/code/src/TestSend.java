import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestSend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factoryWO = new Configuration()
				.configure()
				.addAnnotatedClass(Workout.class)
				.buildSessionFactory();
		//create session
		Session sessionWO = factoryWO.getCurrentSession();
		sessionWO.beginTransaction();
		
		Workout tWorkout = new Workout(new Date(), 87);
		sessionWO.save(tWorkout);
		sessionWO.getTransaction().commit();
		System.out.println("sent workout");
		
		System.out.println("retrieving");
		
		SessionFactory factoryWOrecieve = new Configuration()
				.configure()
				.addAnnotatedClass(Workout.class)
				.buildSessionFactory();
		//create session
		Session sessionWOrecieve = factoryWOrecieve.getCurrentSession();
		sessionWOrecieve.beginTransaction();
		List<Workout> wOs = sessionWOrecieve.createQuery("from Workout w where w.idworkouts = 87").getResultList();
		System.out.println(wOs.get(0).toString());
	}

}
