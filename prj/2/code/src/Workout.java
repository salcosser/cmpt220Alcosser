
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;




@Entity
@Table(name="workouts")
public class Workout{

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idworkouts")
	private int idworkouts;
	
	@Column(name="date")
	private Date date;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name="workoutid", referencedColumnName= "idworkouts")
	private List<exerciseDone> exDone = new ArrayList<exerciseDone>();
	
	@Column(name="users_id")
	private int userId;
	
	
	public int getIdworkouts() {
		return idworkouts;
	}
	public void setIdworkouts(int idworkouts) {
		this.idworkouts = idworkouts;
	}


	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}

	

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	Workout(){}
	public Workout(Date date, int userId) {
		super();
		this.date = date;
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "Workout [idworkouts=" + idworkouts + ", date="
				+ date +  ", userId=" + userId + "]";
	}
	
}
