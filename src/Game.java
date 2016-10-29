import java.util.Scanner;

public class Game {
	
	
	Text tekst = new Text();
	private Player player1 = new Player("SutDiller", 1000);
	private Player player2 = new Player("Bojack", 1000);
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
	
	public void landed(Player p)
	{
		System.out.print(p.getPlayerName() + " landed on ");
		System.out.println(tekst.getFieldDescription(shake.getShake()));
		System.out.println("dice value " + shake.getShake());
	}
	public void switchens(Player p)
	{
		switch(shake.getShake())
		{
		case 1: landed(p);
		break;
		case 2:landed(p);
		break;
		case 3:landed(p);
		break;
		case 4:landed(p);
		break;
		case 5:landed(p);
		break;
		case 6:landed(p);
		break;
		case 7:landed(p);
		break;
		case 8:landed(p);
		break;
		case 9:landed(p);
		break;
		case 10:landed(p);
		break;
		case 11:landed(p);
		break;
		case 12: landed(p);
		break;
		}
	}
	public void playerTurn(Player p)
	{
		System.out.println(p.getPlayerName() + " Please roll the dice");
		scan.nextLine();
		shake.setShake();
		switchens(p);
		p.setAccount(tekst.getFieldValue(shake.getShake()));
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
