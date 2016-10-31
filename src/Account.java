
public class Account {

	private int Balance;
	private int MIN=0;

public Account()	
{
		Balance = 1000;
}
	
/**
 * Calculates the player's balance. This is done by having the (int currentShakerValue) added to the score. 
 * @param currentShakerValue Adds the current shaker points to the total score.
 * @return
 */
public int setBalance(int point)
{
	Balance = Balance + point;
	return Balance;
}

/**
 * Returns the player's current balance.
 * @return
 */
public int getBalance()
{
	return Balance;
}
/*
 * Makes sure the player's balance can't get below 0
 */

public int minBalance()
{
	if (Balance <= MIN){
		Balance=0;
	}
	return Balance;
}

/**
 * Converts the Balance from an int to a string.
 */
public static String toString(Account print)
{
	return Integer.toString(print.Balance);
}
}