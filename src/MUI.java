import desktop_resources.GUI;
import desktop_fields.Field;
import desktop_fields.Street;

public class MUI 


{
	/**
	 * @param createBoard Creates the GUI with a set of 13 fields difined by the fieldArray from Text
	 * @param text The Text class where the fieldArray is located
	 */
	public void createBoard(Text text)
	{
	Field[] fields = new Field[13];
	fields[0] = new Street.Builder().setTitle("START").setSubText(" ").build();
	fields[1] = new Street.Builder().setTitle(" ").setSubText(" ").build();
	fields[2] = new Street.Builder().setTitle(text.fieldArray[2].getFieldText()).setRent(text.fieldArray[2].getValueString()).setSubText(text.fieldArray[2].getValueString()).build();
	fields[3] = new Street.Builder().setTitle(text.fieldArray[3].getFieldText()).setRent(text.fieldArray[3].getValueString()).setSubText(text.fieldArray[3].getValueString()).build();
	fields[4] = new Street.Builder().setTitle(text.fieldArray[4].getFieldText()).setRent(text.fieldArray[4].getValueString()).setSubText(text.fieldArray[4].getValueString()).build();
	fields[5] = new Street.Builder().setTitle(text.fieldArray[5].getFieldText()).setRent(text.fieldArray[5].getValueString()).setSubText(text.fieldArray[5].getValueString()).build();
	fields[6] = new Street.Builder().setTitle(text.fieldArray[6].getFieldText()).setRent(text.fieldArray[6].getValueString()).setSubText(text.fieldArray[6].getValueString()).build();
	fields[7] = new Street.Builder().setTitle(text.fieldArray[7].getFieldText()).setRent(text.fieldArray[7].getValueString()).setSubText(text.fieldArray[7].getValueString()).build();
	fields[8] = new Street.Builder().setTitle(text.fieldArray[8].getFieldText()).setRent(text.fieldArray[8].getValueString()).setSubText(text.fieldArray[8].getValueString()).build();
	fields[9] = new Street.Builder().setTitle(text.fieldArray[9].getFieldText()).setRent(text.fieldArray[9].getValueString()).setSubText(text.fieldArray[9].getValueString()).build();
	fields[10] = new Street.Builder().setTitle(text.fieldArray[10].getFieldText()).setRent(text.fieldArray[10].getValueString()).setSubText(text.fieldArray[10].getValueString()).build();
	fields[11] = new Street.Builder().setTitle(text.fieldArray[11].getFieldText()).setRent(text.fieldArray[11].getValueString()).setSubText(text.fieldArray[11].getValueString()).build();
	fields[12] = new Street.Builder().setTitle(text.fieldArray[12].getFieldText()).setRent(text.fieldArray[12].getValueString()).setSubText(text.fieldArray[12].getValueString()).build();
	GUI.create(fields);
	}
	
	/**
	 * @param addPlayer Adds a player to the board
	 */
	public void addPlayer(Player player)
	{
		GUI.addPlayer(player.getPlayerName(), player.getAccount().getBalance());
	}
	
	/**
	 * @param setBalance Shows the Balance of a player on the board
	 */
	public void setBalance(Player player)
	{
		GUI.setBalance(player.getPlayerName(), player.getAccount().getBalance());
	}
	
	/**
	 * @param setDice Shows to dice with given integer values at a random position on the board
	 */
	public void setDice(Shaker shaker)
	{
		GUI.setDice(shaker.getDie1(), shaker.getDie2());
	}
	
	/**
	 * @param setCar Sets a car on a given field position (-1) on the board
	 */
	public void setCar(Player player,Shaker shaker)
	{
		GUI.setCar(shaker.getShake()+1, player.getPlayerName());
	}
	
	/**
	 * @param removeCar Removes a car on a given field position (-1) on the board
	 */
	public void removeCar(Player player,Shaker shaker)
	{
		GUI.removeCar(shaker.getShake()+1,player.getPlayerName());
	}
	
	/**
	 * @param displayTurnDescription Shows a description of the actions performed on a turn in the middle of the board
	 */
	public void displayTurnDescription(Text text,Player player,Shaker shaker)
	{
		
		GUI.displayChanceCard(text.getTurnDescription(player, shaker));
	}
}
