package SchedulerQuestion;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestForSchedular {

	@Test
	public void addGameSuccess() {

		Game testGame = new Game("basketball",2);
		SchedularService testService = new SchedularService();
		assertEquals("Successful adding of Game",testService.createGame(testGame));
	}
	
	
	@Test
	public void addDuplicateGame() {
		Game testGame = new Game("basketball",2);
		SchedularService testService = new SchedularService();
		testService.createGame(testGame);
		assertEquals("Game already exist within Game List",testService.createGame(testGame));
	}

	@Test
	public void addGameWithoutName() {
		Game testGame = new Game("",2);
		SchedularService testService = new SchedularService();
		testService.createGame(testGame);
		assertEquals("Game name should not be empty",testService.createGame(testGame));
	}
	
	
	@Test
	public void addGameWithoutPlayers() {
		Game testGame = new Game("basketball",0);
		SchedularService testService = new SchedularService();
		testService.createGame(testGame);
		assertEquals("No. of players should not be zero",testService.createGame(testGame));
	}
	
	@Test
	public void addNullGame() {
		Game testGame = null;
		SchedularService testService = new SchedularService();
		testService.createGame(testGame);
		assertEquals("Game should not be null",testService.createGame(testGame));
	}
	
	
	
	@Test
	public void addPlayerSuccess() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);

		
		testService.createGame(tennis);
		
		Game[] gamesTestPlayerPlay = {basketball, football, tennis};
		Player testPlayer = new Player("tom", gamesTestPlayerPlay);
		assertEquals("Successful adding of Player",testService.createPlayer(testPlayer));
	}
	
	
	@Test
	public void addPlayerWhoDoNotPlayGame() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);

		
		testService.createGame(tennis);
		
		Game[] gamesTestPlayerPlay = new Game[5]; //Initialize an array of nulls, no games added under Tom
		Player testPlayer = new Player("tom", gamesTestPlayerPlay);
		assertEquals("Player's game list should not be null",testService.createPlayer(testPlayer));
	}
	
	
	@Test
	public void addPlayerWithoutName() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);

		
		testService.createGame(tennis);
		
		Game[] gamesTestPlayerPlay = {basketball, football, tennis};
		
		Player testPlayer = new Player("", gamesTestPlayerPlay);
		assertEquals("Player name should not be empty",testService.createPlayer(testPlayer));
	}
	
	
	@Test
	public void addDuplicatePlayer() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);

		
		testService.createGame(tennis);
		
		Game[] gamesTestPlayerPlay = {basketball, football, tennis};
		
		Player testPlayer = new Player("tom", gamesTestPlayerPlay);
		
		testService.createPlayer(testPlayer);
		assertEquals("Player already exist within Player List",testService.createPlayer(testPlayer));
	}
	
	
	@Test
	public void addNullPlayer() {
		
		SchedularService testService = new SchedularService();

		Player testPlayer = null;
		
		testService.createPlayer(testPlayer);
		
		assertEquals("Player object should not be null",testService.createPlayer(testPlayer));
	}
	
	@Test
	public void addNullDay() {
		
		SchedularService testService = new SchedularService();

		Day testDay = null;		
		assertEquals("Day object should not be null",testService.createDay(testDay));
	}
	
	@Test
	public void addDaySuccess() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);
		
		testService.createGame(tennis);
		
		Game[] gamesPlayedOnTestDay = {basketball, football, tennis};
		
		Day testDay = new Day("testDay",gamesPlayedOnTestDay );
		assertEquals("Successful adding of Day",testService.createDay(testDay));
	}
	
	
	@Test
	public void addDayWithoutName() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);
		
		testService.createGame(tennis);
		
		Game[] gamesPlayedOnTestDay = {basketball, football, tennis};
		
		Day testDay = new Day("",gamesPlayedOnTestDay );
		assertEquals("Day name should not be empty",testService.createDay(testDay));
	}
	
	
	
	@Test
	public void addDuplicateDay() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);
		
		testService.createGame(tennis);
		
		Game[] gamesPlayedOnTestDay = {basketball, football, tennis};
		
		Day testDay = new Day("testDay",gamesPlayedOnTestDay );
		testService.createDay(testDay);
		assertEquals("Day already exist within Day List",testService.createDay(testDay));
	}
	
	
	@Test
	public void addDayWithNoGamesPlayed() {
		
		SchedularService testService = new SchedularService();
		
		Game basketball = new Game("basketball",2);
		Game football = new Game("football",3);
		Game tennis = new Game("tennis",1);
		
		testService.createGame(tennis);
		
		Game[] gamesPlayedOnTestDay = new Game[5];
		
		Day testDay = new Day("testDay",gamesPlayedOnTestDay );
		testService.createDay(testDay);
		assertEquals("Day's game list should not be null",testService.createDay(testDay));
	}
	
}

