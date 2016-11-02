
public class Account {

	private int Balance;
	private int MIN=0;

	/**
	 * @param Account Constructor. Creates an Account object with the inital balance of 1000
	 */
public Account()	
{
		Balance = 1000;
}
	
/**
 * Calculates the player's balance. This is done by having the (int currentShakerValue) added to the score. 
 * @param currentShakerValue Adds the current shaker points to the total score.
 * @param point the integer value to be added to the balance.
 * @return Balance
 */
public int setBalance(int point)
{
	Balance = Balance + point;
	return Balance;
}

/**
 * Returns the player's current balance.
 * @return Balance
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
 * Converts the Balance from an integer to a string.
 */
public String toString()
{
	return Integer.toString(Balance);
}
}