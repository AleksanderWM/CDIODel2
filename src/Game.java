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
		text.printStartDescription();
		mui.createBoard(text);
		mui.addPlayer(player1);
		mui.addPlayer(player2);
		mui.setCar(player1, shaker);
		mui.setCar(player2, shaker);
		playLoop();
	}
	
/**e
 * @param p the Player object with the current turn
 * @param gameResult Calls the turnDescription method, thereby printing the result of the turn to the player
 */
	public void gameResult(Player p)
	{
		switch(shaker.getShake())
		{
		case 2: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 3: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 4: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 5: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 6: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 7: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 8: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 9: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 10: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 11: System.out.print(text.getTurnDescription(p,shaker));
		break;
		case 12: System.out.print(text.getTurnDescription(p,shaker));
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
		shaker.resetShake();
		mui.removeCar(p, shaker);
		shaker.setShake();
		p.getAccount().setBalance(text.getFieldValue(shaker.getShake()));
		mui.setDice(shaker);
		mui.setBalance(p);
		mui.setCar(p, shaker);
		gameResult(p);
		mui.displayTurnDescription(text,p,shaker);
		scan.nextLine();
		mui.removeCar(p, shaker);
		shaker.resetShake();
		mui.setCar(p, shaker);
			
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
			text.printEndDescription();
			scan.nextLine();
			System.exit(0);
			}
		
	}


}
