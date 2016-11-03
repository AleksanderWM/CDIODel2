package main;
/**
 * @author Emil 
 * This class holds the responsibility to call the methods from the GUI.
 */
import desktop_resources.GUI;
import java.awt.Color;
import desktop_fields.Refuge;
import desktop_fields.Field;
import desktop_fields.Start;

public class MUI 

{
	private Color Water = new Color(139, 183, 240);
	/**
	 * @param createBoard Creates the GUI with a set of 13 fields difined by the fieldArray from Text
	 * @param text The Text class where the fieldArray is located
	 */
	
	void createBoard(Text text)
	{
	Field[] fields = new Field[13];
	fields[0] = new Start.Builder().
			setTitle(text.getStartField()).
			setBgColor(Color.RED).
			setSubText(null).
			build();
	
/**
 * Bridge
 */
	fields[1] = new Refuge.Builder().
			setTitle(text.getBlankSpace()).
			setSubText(null).
			setPicture(text.fieldArray[1].getPicture()).
			setDescription(text.getBlankSpace()).
			setBgColor(Water).
			build();
/**
 * Tower
 */
	fields[2] = new Refuge.Builder().
			setTitle(text.fieldArray[2].getFieldText()).
			setSubText(text.fieldArray[2].getFieldText()).
			setDescription(text.fieldArray[2].getValueString()).
			setPicture(text.fieldArray[2].getPicture()).
			setBgColor(Color.WHITE).
			build();
/**
 * Crater
 */
	fields[3] = new Refuge.Builder().
			setTitle(text.fieldArray[3].getFieldText()).
			setSubText(text.fieldArray[3].getFieldText()).
			setDescription(text.fieldArray[3].getValueString()).
			setPicture(text.fieldArray[3].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * Palace Gates
 */
	fields[4] = new Refuge.Builder().
			setTitle(text.fieldArray[4].getFieldText()).
			setSubText(text.fieldArray[4].getFieldText()).
			setDescription(text.fieldArray[4].getValueString()).
			setPicture(text.fieldArray[4].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * Cold Desert
 */
	fields[5] = new Refuge.Builder().
			setTitle(text.fieldArray[5].getFieldText()).
			setSubText(text.fieldArray[5].getFieldText()).
			setDescription(text.fieldArray[5].getValueString()).
			setPicture(text.fieldArray[5].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * Walled City
 */
	fields[6] = new Refuge.Builder().
			setTitle(text.fieldArray[6].getFieldText()).
			setSubText(text.fieldArray[6].getFieldText()).
			setDescription(text.fieldArray[6].getValueString()).
			setPicture(text.fieldArray[6].getPicture()).
			setBgColor(Color.WHITE).
			build();
/**
 * Monastery
 */
	fields[7] = new Refuge.Builder().
			setTitle(text.fieldArray[7].getFieldText()).
			setSubText(text.fieldArray[7].getFieldText()).
			setDescription(text.fieldArray[7].getValueString()).
			setPicture(text.fieldArray[7].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * Black Cave
 */
	fields[8] = new Refuge.Builder().
			setTitle(text.fieldArray[8].getFieldText()).
			setSubText(text.fieldArray[8].getFieldText()).
			setDescription(text.fieldArray[8].getValueString()).
			setPicture(text.fieldArray[8].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * Huts in the mountain
 */
	fields[9] = new Refuge.Builder().
			setTitle(text.fieldArray[9].getFieldText()).
			setSubText(text.fieldArray[9].getFieldText()).
			setDescription(text.fieldArray[9].getValueString()).
			setPicture(text.fieldArray[9].getPicture()).
			setBgColor(Color.WHITE).
			build();
	
/**
 * The WareWall
 */
	fields[10] = new Refuge.Builder().
			setTitle(text.fieldArray[10].getFieldText()).
			setSubText(text.fieldArray[10].getFieldText()).
			setDescription(text.fieldArray[10].getValueString()).
			setPicture(text.fieldArray[10].getPicture()).
			setBgColor(Color.WHITE).
			build();	
	
/**
 * The Pit
 */
	fields[11] = new Refuge.Builder().
			setTitle(text.fieldArray[11].getFieldText()).
			setSubText(text.fieldArray[11].getFieldText()).
			setDescription(text.fieldArray[11].getValueString()).
			setPicture(text.fieldArray[11].getPicture()).
			setBgColor(Color.WHITE).
			build();
/**
 * Goldmine
 */
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
	void addPlayer(Player player)
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
		GUI.setDice(shaker.getDie1().getRoll(), shaker.getDie2().getRoll());
	}
	
	/**
	 * @param setCar Sets a car on a given field position (-1) on the board
	 */
	void setCar(Player player,Shaker shaker)
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
	private void removeCar(Player player,Shaker shaker)
	{
		GUI.removeAllCars(player.getPlayerName());
	}
	
	/**
	 * @param displayTurnDescription Shows a description of the actions performed on a turn in the middle of the board
	 */
	void displayMidDescription(String text)
	{
		GUI.displayChanceCard(text);
	}
	/**
	 * Creates the Button with a given string.
	 * @param msg
	 * @param button
	 */
	void button(String msg,String button)
	{
		GUI.getUserButtonPressed(msg, button);
	}
	/**
	 * Displays the discription from the initial point of the turn, edits the button to say" Take Turn, and removes the car.
	 * @param player
	 * @param shaker
	 * @param text
	 */
	void initialTurn(Player player, Shaker shaker, Text text)
	{
		displayMidDescription(player.getPlayerName() + text.getPlayerTurn());
		button(player.getPlayerName(),text.getTakeTurn());
		removeCar(player, shaker);
	}
	/**
	 * Displays the discription from the main point of the turn, edits the button to say End turn, and sets the Car. 
	 * After the button is pressed removes the car and puts it on start again.
	 * @param player
	 * @param shaker
	 * @param text
	 */
	void mainTurn(Player player, Shaker shaker,Text text)
	{
		setDice(shaker);
		setBalance(player);
		setCar(player, shaker);
		displayMidDescription(text.getTurnDescription(player, shaker));
		button(player.getPlayerName(),text.getEndTurn());
		removeCar(player, shaker);
		setCarOnStart(player);
	}
}