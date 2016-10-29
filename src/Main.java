
public class Main {

	public static void main(String[] args) 
	
	{
		Account bank1 = new Account();
		Player player1 = new Player("Player1",bank1);
		System.out.println(player1.getAccount());

	}

}
