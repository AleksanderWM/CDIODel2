package main;
/**
 * @author Aleksander.
 * edited by Emil
 * This class holds the responsibility to manage the rules of the game.
 */
public class Rule {
	
	//Rule for Werewall (Used for -80 points and eksta turn)
	boolean ruleWolf(Shaker shaker)
	{
		if (shaker.getShake() == 10)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//Rule used for winner
	boolean winner(Player player)
	{
	if(player.getAccount().getBalance() >= 3000)
	{
	System.out.println(player.getAccount());
	return true;
	}
	return false;
	}
}