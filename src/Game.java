import java.util.Scanner;

public class Game {
	
	
	Text text = new Text();
	private Player player1 = new Player("Player one");
	private Player player2 = new Player("Player two");
	Shaker shake = new Shaker();
	private Scanner scan = new Scanner(System.in);
	public int count = 1;
	Rule rules = new Rule();
	
	public Game()
	{
		
	}


	public void play()
	{
		

		text.startDescription();
		playLoop();
	}
	

	public void gameResult(Player p)
	{
		switch(shake.getShake())
		{
		case 1: text.TurnDescription(p,shake);
		break;
		case 2: text.TurnDescription(p,shake);
		break;
		case 3: text.TurnDescription(p,shake);
		break;
		case 4: text.TurnDescription(p,shake);
		break;
		case 5: text.TurnDescription(p,shake);
		break;
		case 6: text.TurnDescription(p,shake);
		break;
		case 7: text.TurnDescription(p,shake);
		break;
		case 8: text.TurnDescription(p,shake);
		break;
		case 9: text.TurnDescription(p,shake);
		break;
		case 10: text.TurnDescription(p,shake);
		break;
		case 11: text.TurnDescription(p,shake);
		break;
		case 12: text.TurnDescription(p,shake);
		break;
		}
	}
	public void playerTurn(Player p)
	{
		System.out.println(p.getPlayerName() + ", please roll the dice");
		scan.nextLine();
		shake.setShake();
		gameResult(p);
		p.getAccount().setBalance(Text.getFieldValue(shake.getShake()));
		shake.resetShake();
		System.out.println(p.getAccount());
		
		
		
	}
	
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
			rules(player1);
			}
			while(count == 2)
			{
			playerTurn(player2);
			count--;
			if(rules.ruleWolf(shake) == true)
				{count = 2;}
			rules(player2);
			}
		}
			
	}
	
	public void rules(Player player)
	{
		if(rules.winner(player) == true)
			text.getEndDescription();
	}


}
