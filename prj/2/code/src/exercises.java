import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="exercises")
public class exercises implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idexercises")
	private int idExercises;
	@Column(name="name")
	private String name;
	@Column(name="muscle_group")
	private String mGroup;
	public int getIdExercises() {
		return idExercises;
	}
	public void setIdExercises(int idExercises) {
		this.idExercises = idExercises;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getmGroup() {
		return mGroup;
	}
	public void setmGroup(String mGroup) {
		this.mGroup = mGroup;
	}
	@Override
	public String toString() {
		return "exercises [idExercises=" + idExercises + ", name=" + name + ", mGroup=" + mGroup + "]";
	}
	public exercises(String name, String mGroup) {
		super();
		this.name = name;
		this.mGroup = mGroup;
	}
	exercises(){};
}
