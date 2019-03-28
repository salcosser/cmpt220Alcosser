import java.util.Date;
//Sam Alcosser
//3-27-19
//class for the goals
public class Goal {
	
	//defining the attributes
	private Date minute;
	private Player player;
	//no args constructor
	Goal(){};
	//secondary constructor
	Goal(Date minute, Player player){
		this.minute = minute;
		this.player = player;
	}
	//setters and getters for both minute and player
	public void setMinute(Date minute) {
		this.minute = minute;
	}
	public Date getMinute() {
		return minute;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public Player getPlayer() {
		return player;
	}
}
