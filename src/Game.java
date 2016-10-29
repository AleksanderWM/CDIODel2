import java.util.Scanner;

public class Game {
	
	
	Text tekst = new Text();
	private Player player1 = new Player("Player one", 1000);
	private Player player2 = new Player("Player two", 1000);
	Shaker shake = new Shaker();
	private Scanner scan = new Scanner(System.in);
	public int count = 1;
	Rule rules = new Rule();
	
	public Game()
	{
	
	}
	
	

	public void play()
	{
		

		tekst.startDescription();
		playLoop();
	}
	
	//public void landed(Player player,Shaker shake)
//	{
//		Text.setTurnDescription(this.Player, this.shake);
//		Text.getTurnDescription();
//	}
	public void gameResult(Player p)
	{
		switch(shake.getShake())
		{
		case 1: Text.TurnDescription(p,shake);
		break;
		case 2: Text.TurnDescription(p,shake);
		break;
		case 3: Text.TurnDescription(p,shake);
		break;
		case 4: Text.TurnDescription(p,shake);
		break;
		case 5: Text.TurnDescription(p,shake);
		break;
		case 6: Text.TurnDescription(p,shake);
		break;
		case 7: Text.TurnDescription(p,shake);
		break;
		case 8: Text.TurnDescription(p,shake);
		break;
		case 9: Text.TurnDescription(p,shake);
		break;
		case 10: Text.TurnDescription(p,shake);
		break;
		case 11: Text.TurnDescription(p,shake);
		break;
		case 12: Text.TurnDescription(p,shake);
		break;
		}
	}
	public void playerTurn(Player p)
	{
		System.out.println(p.getPlayerName() + ", please roll the dice");
		scan.nextLine();
		shake.setShake();
		gameResult(p);
		p.setAccount(Text.getFieldValue(shake.getShake()));
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
				count = 1;
			rules(player1);
			}
			playerTurn(player2);
			count--;
			if(rules.ruleWolf(shake) == true)
				count = 2;
			rules(player2);
		}
			
	}
	
	public void rules(Player player)
	{
		if(rules.winner(player) == true)
			tekst.getEndDescription();
	}


}
