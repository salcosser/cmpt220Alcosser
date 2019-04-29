//Sam Alcosser

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="exercisedone")		//connecting this class to create an entity in the exercisedone table in MySQL
public class exerciseDone implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	/**
	 * 
	 */
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idexercise_done")
	private int idEDone;			//making the primary key of the exercise class
	
	
	@Column(name = "exerciseid")				// linking the different variables to the columns in the entity
	private int exerciseId;
	
	@Column(name="reps")
	private int reps;
	
	@Column(name="sets")
	private int sets;
	
	
	

	
	//@ManyToOne(cascade=CascadeType.ALL)
	//@JoinColumn(name="workoutid",referencedColumnName = "idworkouts", insertable = false, updatable = false)// debugging purposes
	private Workout wO;

	@Column(name="workoutid")
	private int woID = wO.getIdworkouts();
	
	public int getwO() {
		return wO.getIdworkouts();
	}

	public void setwO(Workout wO) {
		this.wO = wO;
	}
	@Column(name="weight_lbs")
	private double weight;



	
	public double getWeight() {				//setters and getters
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIdEDone() {
		return idEDone;
	}

	public void setIdEDone(int idEDone) {
		this.idEDone = idEDone;
	}

	public int getExerciseId() {
		return exerciseId;
	}
	
	public void setExerciseId(int exerciseId) {
		this.exerciseId = exerciseId;
	}
	
	
	public int getReps() {
		return reps;
	}

	public void setReps(int reps) {
		this.reps = reps;
	}

	public int getSets() {
		return sets;
	}

	public void setSets(int sets) {
		this.sets = sets;
	}



	@Override
	public String toString() {
		return "exerciseDone [idEDone=" + idEDone + ", exerciseId=" + exerciseId + ", reps=" + reps + ", sets=" + sets
				+ ", wO=" + wO + ", weight=" + weight + "]";
	}

	exerciseDone(){}
	//constructor for the class
	public exerciseDone(int exerciseId, int reps, int sets, Workout wO, double weight) {
		super();
		this.exerciseId = exerciseId;
		this.reps = reps;
		this.sets = sets;
		this.wO = wO;
		this.weight = weight;
	}
	
}
