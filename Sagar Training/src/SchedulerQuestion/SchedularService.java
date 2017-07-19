package SchedulerQuestion;

public class SchedularService implements ISchedularService {
	private GameRepo gameR = new GameRepo();
	private DayRepo dayR = new DayRepo();
	private PlayerRepo playerR = new PlayerRepo();
	
	@Override
	public String createGame(Game g) {
		StringBuilder sb = new StringBuilder(40);
		
		if(g == null) {
			sb.append("Game should not be null"); // Check if game object passed is null
			return sb.toString();
		}
		
		if(g.getNoOfPlayers() == 0) {
			sb.append("No. of players should not be zero"); //Check if game object passed does not have any players
			return sb.toString();
		} 
		
		if(g.getName().isEmpty()) {
			sb.append("Game name should not be empty"); //Check if game object passed does not have a game name
			return sb.toString();
		}
				
		return gameR.save(g);
	}

	@Override
	public String createPlayer(Player p) {
		StringBuilder sb1 = new StringBuilder(40);
		boolean playerGameExistInGameList = false;
		
			if(p == null) {
				sb1.append("Player object should not be null"); // Checking if player object passed is null
				return sb1.toString();
			}
			
			if(p.getGames()[0] == null) {
				sb1.append("Player's game list should not be null"); // Checking if game list of Player is null
				return sb1.toString();
			}
			
			if(p.getName().isEmpty()) {
				sb1.append("Player name should not be empty"); // Check if player object passed does not have a player name
				return sb1.toString();
			}
			
			for(int i=0; i<p.getGames().length; i++) { //Check if the game exist in the game repository
				if(p.getGames()[i] == null) {
					break;
				}
				if(gameR.findOne(p.getGames()[i].getName()) != null) { //if findOne finds a match, it returns a game object which is non-null
					playerGameExistInGameList = true;					
				}
			
			}
			
			if(!playerGameExistInGameList) {
				sb1.append("Player's games cannot be found in game list");
				return sb1.toString();
			}
		
		
		return playerR.save(p);
	}

	@Override
	public String createDay(Day d) {
		StringBuilder sb2 = new StringBuilder(40);
		boolean dayGameExistInGameList = false;
		
		if(d == null) {
			sb2.append("Day object should not be null"); // Check if the day object passed is null
			return sb2.toString();
		}
		
		if(d.getGames()[0] == null) {
			sb2.append("Day's game list should not be null"); // Check if game list of Day is null
		}
		
		if(d.getName().isEmpty()) {
			sb2.append("Day name should not be empty"); // Check if day object passed does not have a day name
		}
		
		for(int i=0; i<d.getGames().length; i++) { // Check if the game exist in the game repository
			if(gameR.findOne(d.getGames()[i].getName()) != null) { //if findOne finds a match, it returns a game object which is non-null
				dayGameExistInGameList = true; 
				}
			
				}
		
		if(!dayGameExistInGameList) {
			sb2.append("Day's games cannot be found in game list");
			return sb2.toString();
		}
		
		return dayR.save(d);
	}

	@Override
	public StringBuffer gameWiseReport(String gameName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuffer playerWiseReport(String playerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StringBuffer dayWiseReport(String dayName) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
