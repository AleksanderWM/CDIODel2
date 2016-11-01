import java.util.Scanner;

public class Game {
	
	
	Text text = new Text();
	private Player player1 = new Player("Player one");
	private Player player2 = new Player("Player two");
	Shaker shake = new Shaker();
	private Scanner scan = new Scanner(System.in);
	public int count = 1;
	Rule rules = new Rule();
	
	/**
	 * @param play Starts the method playLoop, thereby starting the game
	 */
	public void play()
	{
		text.printStartDescription();
		playLoop();
	}
	
/**
 * @param p the Player object with the current turn
 * @param gameResult Calls the turnDescription method, thereby printing the result of the turn to the player
 */
	public void gameResult(Player p)
	{
		switch(shake.getShake())
		{
		case 1: text.turnDescription(p,shake);
		break;
		case 2: text.turnDescription(p,shake);
		break;
		case 3: text.turnDescription(p,shake);
		break;
		case 4: text.turnDescription(p,shake);
		break;
		case 5: text.turnDescription(p,shake);
		break;
		case 6: text.turnDescription(p,shake);
		break;
		case 7: text.turnDescription(p,shake);
		break;
		case 8: text.turnDescription(p,shake);
		break;
		case 9: text.turnDescription(p,shake);
		break;
		case 10: text.turnDescription(p,shake);
		break;
		case 11: text.turnDescription(p,shake);
		break;
		case 12: text.turnDescription(p,shake);
		break;
		}
	}
	
	/**
	 * @param playerTurn perform a single turn by rolling the dice, setting the balance and returning all relevant info in correspondence to the current player
	 * @param p the current player performing a turn
	 */
	public void playerTurn(Player p)
	{
		System.out.println(p.getPlayerName() + ", please roll the dice");
		scan.nextLine();
		shake.setShake();
		gameResult(p);
		p.getAccount().setBalance(text.getFieldValue(shake.getShake()));
		shake.resetShake();
		System.out.println(p.getAccount());
		
		
		
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
			if(rules.ruleWolf(shake) == true)
				{count = 1;}
			endGame(player1);
			}
			while(count == 2)
			{
			playerTurn(player2);
			count--;
			if(rules.ruleWolf(shake) == true)
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
			text.printEndDescription();
			scan.nextLine();
			System.exit(0);
			}
		
	}


}
