//Sam Alcosser
//3-27-19
//player class
public class Player {
	//declaring variables
	private String name;
	private int goals;
	private String team;
	//no-args constructor
	Player(){};
	public String getName() {
		return name;
	}
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	//getter for goals
	public int getGoals() {
		return goals;
	}
	//setter for goals
	public void setGoals(int goals){
		this.goals = goals;
	}
	//getters and setters for team
	public String getTeam() {
		return team;
	}
	public void setTeam(String team){
		this.team = team;
	}

}
