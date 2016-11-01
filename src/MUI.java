import desktop_resources.GUI;
import java.awt.Color;
import desktop_fields.Refuge;
import desktop_fields.Field;
import desktop_fields.Street;
import desktop_fields.Start;

public class MUI 


{
	Color Basecolor = new Color(51, 204, 0);
	Color Water = new Color(139, 183, 240);
	/**
	 * @param createBoard Creates the GUI with a set of 13 fields difined by the fieldArray from Text
	 * @param text The Text class where the fieldArray is located
	 */
	public void createBoard(Text text)
	{
	Field[] fields = new Field[13];
	fields[0] = new Start.Builder().
			setTitle("START").
			setBgColor(Color.RED).
			setSubText(null).
			build();
	fields[1] = new Refuge.Builder().
			setTitle(" ").
			setSubText(null).
			setPicture(text.fieldArray[1].getPicture()).
			setDescription(" ").
			setBgColor(Water).
			build();
	fields[2] = new Refuge.Builder().
			setTitle(text.fieldArray[2].getFieldText()).
			setSubText(text.fieldArray[2].getFieldText()).
			setDescription(text.fieldArray[2].getValueString()).
			setPicture(text.fieldArray[2].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[3] = new Refuge.Builder().
			setTitle(text.fieldArray[3].getFieldText()).
			setSubText(text.fieldArray[3].getFieldText()).
			setDescription(text.fieldArray[3].getValueString()).
			setPicture(text.fieldArray[3].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[4] = new Refuge.Builder().
			setTitle(text.fieldArray[4].getFieldText()).
			setSubText(text.fieldArray[4].getFieldText()).
			setDescription(text.fieldArray[4].getValueString()).
			setPicture(text.fieldArray[4].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[5] = new Refuge.Builder().
			setTitle(text.fieldArray[5].getFieldText()).
			setSubText(text.fieldArray[5].getFieldText()).
			setDescription(text.fieldArray[5].getValueString()).
			setPicture(text.fieldArray[5].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[6] = new Refuge.Builder().
			setTitle(text.fieldArray[6].getFieldText()).
			setSubText(text.fieldArray[6].getFieldText()).
			setDescription(text.fieldArray[6].getValueString()).
			setPicture(text.fieldArray[6].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[7] = new Refuge.Builder().
			setTitle(text.fieldArray[7].getFieldText()).
			setSubText(text.fieldArray[7].getFieldText()).
			setDescription(text.fieldArray[7].getValueString()).
			setPicture(text.fieldArray[7].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[8] = new Refuge.Builder().
			setTitle(text.fieldArray[8].getFieldText()).
			setSubText(text.fieldArray[8].getFieldText()).
			setDescription(text.fieldArray[8].getValueString()).
			setPicture(text.fieldArray[8].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[9] = new Refuge.Builder().
			setTitle(text.fieldArray[9].getFieldText()).
			setSubText(text.fieldArray[9].getFieldText()).
			setDescription(text.fieldArray[9].getValueString()).
			setPicture(text.fieldArray[9].getPicture()).
			setBgColor(Color.WHITE).
			build();
	fields[10] = new Refuge.Builder().
			setTitle(text.fieldArray[10].getFieldText()).
			setSubText(text.fieldArray[10].getFieldText()).
			setDescription(text.fieldArray[10].getValueString()).
			setPicture(text.fieldArray[10].getPicture()).
			setBgColor(Color.WHITE).
			build();	
	fields[11] = new Refuge.Builder().
			setTitle(text.fieldArray[11].getFieldText()).
			setSubText(text.fieldArray[11].getFieldText()).
			setDescription(text.fieldArray[11].getValueString()).
			setPicture(text.fieldArray[11].getPicture()).
			setBgColor(Color.WHITE).
			build();	
	fields[12] = new Refuge.Builder().
			setTitle(text.fieldArray[12].getFieldText()).
			setSubText(text.fieldArray[12].getFieldText()).
			setDescription(text.fieldArray[12].getValueString()).
			setPicture(text.fieldArray[12].getPicture()).
			setBgColor(Color.WHITE).
			build();	
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
	 * 
	 * @param setCarOnStart sets the car on the start field again.
	 */
	public void setCarOnStart(Player player)
	{
		GUI.setCar(1, player.getPlayerName());
	}
	/**
	 * @param removeCar Removes a car on a given field position (-1) on the board
	 */
	public void removeCar(Player player,Shaker shaker)
	{
		GUI.removeAllCars(player.getPlayerName());
	}
	
	/**
	 * @param displayTurnDescription Shows a description of the actions performed on a turn in the middle of the board
	 */
	public void displayTurnDescription(Text text,Player player,Shaker shaker)
	{
		
		GUI.displayChanceCard(text.getTurnDescription(player, shaker));
	}
}
