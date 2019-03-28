import java.util.Date;
//Sam Alcosser
//3-27-19
//soccer match class
public class soccerMatch {
	//setting attributes
	Date startTime;
	Date endTime;
	String location;
	String home = "home";
	String visitor = "visitor";
	private Player[] homePlayers = new Player[11];
	private Player[] visitorPlayers = new Player[11];
	private Goal[] homeGoals = new Goal[10];
	private Goal[] visitorGoals = new Goal[10];
	//no-args constructor
	soccerMatch() {};
	//secondary constructor
	soccerMatch( Date startTime, Player[] homePlayers, Player[] visitorPlayers){
		this.startTime = startTime;
		this.homePlayers = homePlayers;
		this.visitorPlayers = visitorPlayers;
	}
	//adds necessary for private attributes
	public void addHomePlayer(Player player) {
		for(Player n: homePlayers) {
			if(n==null) {
				n = player;
				break;
			}
		}
		player.setTeam("home");
	}
	
	public void addVisitorPlayer(Player player){
		for(Player n: visitorPlayers) {
			if(n == null) {
				n = player;
				break;
			}
		}
		player.setTeam("visitor");
	}
	//finds which team has more goals listed
	public String getWinner() {
		int countH = 0;
	    for(Goal g : homeGoals) {
	        if (g != null) {
	            ++countH;
	        }
	    }
	    int countV = 0;
	    for(Goal g : visitorGoals) {
	        if (g != null) {
	            ++countV;
	        }
	    }
	    if(countH > countV) {
	    	return "home";
	    }
	    else if(countV > countH) {
	    	return "visitor";
	    }
	    else {
	    	return "tie";
	    }
	}
	//used to add a goal to home
	public void addHomeGoal(Goal goal) {
		for(int g = 0;g<10;g++) {
			if(this.homeGoals[g]==null) {
				this.homeGoals[g] = goal;
				break;
			}
			
		}
	}
	//adds visitor goal
	public void addVisitorGoal(Goal goal) {
		for(int g = 0;g<10;g++) {
			if(this.visitorGoals[g]==null) {
				this.visitorGoals[g] = goal;
				break;
			}
			
		}
	}
	//getters for the goals for each team
	public Goal[] getHomeGoals() {
		return homeGoals;
	}
	public Goal[] getVisitorGoals() {
		return visitorGoals;
	}
}
