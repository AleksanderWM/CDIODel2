
public class Rule {
	
	Shaker shake = new Shaker();
	


	

	
	
	
	public boolean ruleWolf(Shaker shake)
	{
		if (shake.getShake() == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		
	public boolean winner(Player player)
	{
	if(player.getAccount().getBalance() > 3000)
	{
	System.out.println(player.getAccount());
	return true;
	}
	return false;

	
	}
		
	
	
}