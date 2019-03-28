import java.util.Date;
//Sam Alcosser
//3-27-19
//class that is an example of how a game would be played using these classes
public class Game1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating the players and naming them
		Player matt = new Player();
		matt.setName("Matt");
		Player mike = new Player();
		mike.setName("Mike");
		
		Player mark = new Player();
		mark.setName("Mark");
		
		Player jonah = new Player();
		jonah.setName("Jonah");
		
		Player james = new Player();
		james.setName("James");
		
		Player noah = new Player();
		noah.setName("Noah");
		//making a soccer game
		soccerMatch game = new soccerMatch();
		//distributing the players
		game.addVisitorPlayer(matt);
		game.addVisitorPlayer(mike);
		game.addVisitorPlayer(mark);
		game.addHomePlayer(jonah);
		game.addHomePlayer(james);
		game.addHomePlayer(noah);
		//playing the game
		score(game, "home", noah, new Date());
		score(game, "home", james, new Date());
		score(game, "home", noah, new Date());
		score(game, "home", jonah, new Date());
		score(game, "visitor", mike, new Date());
		score(game, "home", jonah, new Date());
		score(game, "visitor", matt, new Date());
		score(game, "visitor", mark, new Date());
		score(game, "visitor", mark, new Date());
		score(game, "home", noah, new Date());
		score(game, "visitor", mike, new Date());
		score(game, "home", jonah, new Date());
		score(game, "home", jonah, new Date());
		score(game, "home", jonah, new Date());
		score(game, "visitor", matt, new Date());
		score(game, "home", james, new Date());
		score(game, "visitor", mark, new Date());
		//formatting and displaying the home team goals
		System.out.println("-----");
		System.out.println("HOME TEAM");
		for(int i  = 0; i< game.getHomeGoals().length;i++) {
			if(game.getHomeGoals()[i] != null) {	
				System.out.print("goal number " + (i+1) + " was scored at " + game.getHomeGoals()[i].getMinute());
				System.out.println(" by " + game.getHomeGoals()[i].getPlayer().getName() + " for the "+ game.getHomeGoals()[i].getPlayer().getTeam() + " team." );
				System.out.println("*****");
			}
			else {
				break;
			}
		}
		//formatting and displaying the visitor team goals
		System.out.println("-----");
		System.out.println("VISITOR TEAM");
		for(int n  = 0; n< game.getVisitorGoals().length;n++) {
			if(game.getVisitorGoals()[n] != null) {	
				System.out.print("goal number " + (n+1) + " was scored at " + game.getVisitorGoals()[n].getMinute());
				System.out.println(" by " + game.getVisitorGoals()[n].getPlayer().getName() + " for the "+ game.getVisitorGoals()[n].getPlayer().getTeam() + " team." );
				System.out.println("*****");
			}
			else {
				break;
			}
		}
		System.out.println("-----");
		System.out.println("AAAAND the Winner is...");
		System.out.println("The " + game.getWinner() + " team!!!");
	}
	//score method which decides who to give the point to, adds the goal with the player and time to the list, and adds a goal to the player
	//and correctly announcing the goal to the world
	public static void score( soccerMatch game, String team, Player player,Date time) {
		
		if(team == "home") {
			System.out.println("GOOOOOOOOOOOOOOOAL FOR THE HOME TEAM!!!");
			game.addHomeGoal(new Goal(time, player));
			player.setGoals(player.getGoals()+1);
		}
		else if(team == "visitor") {
			System.out.println("GOOOOOOOOOOOOOOOAL FOR THE OTHER GUYS!!!");
			game.addVisitorGoal(new Goal(time, player));
			player.setGoals(player.getGoals()+1);
		}
	}
	
}
