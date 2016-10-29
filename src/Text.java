
public class Text {
	
	String start;
	String turn;
	String end;
	CustomField hejsa;
	Player player;
	Shaker shake;

	CustomField[] fieldDescription =
		{
			new CustomField(" ", 0),
			new CustomField(" ", 0),
			new CustomField("Tower", 250),
			new CustomField("Crater", -100),
			new CustomField("Palace Gates", +100),
			new CustomField("Cold Desert", -20),
			new CustomField("Walled city", +180),
			new CustomField("Monastery", 0),
			new CustomField("Black cave", -70),
			new CustomField("Huts in the mountain", +60),
			new CustomField("The Werewall", -80),
			new CustomField("The pit", -50),
			new CustomField("Goldmine", +650),
		};
	
	public String getFieldDescription(int point)
	{ 
		
		return fieldDescription[point].getFieldText();
		
	}
	public int getFieldValue(int point)
	{
		return fieldDescription[point].getValue();
	}

	
	public void startDescription()
	{
		
		System.out.println("Hello Players! today we will be playing a game of dices");
		System.out.println("The object of the game is to get 3000money!!");
		System.out.println("You will each start with 1000money");
		System.out.println("Now we have predetermined names for you guys!");
		System.out.println("Player 1 will be named: Bojack Horseman");
		System.out.println("Player 2 will be named: Richie Rich");
		System.out.println("Good luck to both of you! Player one please start your turn");
		
	}
	
	public String getStartdDescription()
	{
		return start;
		
	}

	
	public void getEndDescription()
	{
		System.out.println("You won the game");
		System.exit(0);
		
	}
	
	public void setTurnDescription(Player player, Shaker shake)
	{
		turn = player.getPlayerName() + "landed on \n " + getFieldDescription(shake.getShake())  + "\n Dice value: " + shake;
	}
	
	public String getTurnDescription()
	{
		return turn;
	}
}
