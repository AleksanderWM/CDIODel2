import java.util.Scanner;

public class Game {
	
	
	Text text = new Text();
	private Player player1 = new Player("Player one");
	private Player player2 = new Player("Player two");
	Shaker shaker = new Shaker();
	private Scanner scan = new Scanner(System.in);
	public int count = 1;
	Rule rules = new Rule();
	MUI mui = new MUI();
	
	/**
	 * @param play Starts the method playLoop, thereby starting the game
	 */
	public void play()
	{
		mui.createBoard(text);
		mui.addPlayer(player1);
		mui.addPlayer(player2);
		mui.setCar(player1, shaker);
		mui.setCar(player2, shaker);
		mui.displayMidDescription(text.getStartDescription());
		mui.button("Welcome", "Start Game");
		playLoop();
	}

	
	/**
	 * @param playerTurn perform a single turn by rolling the dice, setting the balance and returning all relevant info in correspondence to the current player
	 * @param p the current player performing a turn
	 */
	public void playerTurn(Player p)
	{
		mui.displayMidDescription(p.getPlayerName() + "'s Turn!");
		mui.button(p.getPlayerName(),"Take Turn");
		mui.removeCar(p, shaker);
		shaker.setShake();
		p.getAccount().setBalance(text.getFieldValue(shaker.getShake()));
		mui.setDice(shaker);
		mui.setBalance(p);
		mui.setCar(p, shaker);
		mui.displayMidDescription(text.getTurnDescription(p, shaker));
		mui.button(p.getPlayerName(),"End Turn");
		mui.removeCar(p, shaker);
		mui.setCarOnStart(p);
			
	}
	
	/**
	 * @param playLoop The Game instance itself. Takes alternating turns for the two players as long a no player fulfills the winning condition
	 */
	public void playLoop()
	{
		while(count < 4)
		{
			while(count == 1)
			{
			playerTurn(player1);
			count++;
			if(rules.ruleWolf(shaker) == true)
				{count = 1;}
			endGame(player1);
			}
			while(count == 2)
			{
			playerTurn(player2);
			count--;
			if(rules.ruleWolf(shaker) == true)
				{count = 2;}
			endGame(player2);
			}
		}
			
	}
	
	/**
	 * @param endGame if the winning condition is fulfilled in the playLoop method, this method is called, printing an endDescription and termination the game.
	 * @param player the player object
	 */
	public void endGame(Player player)
	{
		if(rules.winner(player) == true)
			{
			mui.displayMidDescription(text.getEndDescription());
			
			System.exit(0);
			}
		
	}


}
