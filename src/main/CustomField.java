package main;
/**
 * @Author Aleksander.
 * Edited by Emil
 * This class holds the responsibility of creating the CustomField, which holds information about the fields on the board.
 */
public class CustomField {
	
	private String fieldDescription;
	private int fieldValue;
	private String fieldPicture;
	
	/**
	 * @param CustomField Constructor. Creates a CustomField object.
	 * @param description Describes the field.
	 * @param value Describes the value of the field.
	 * @param picture The picture associated to that field.
	 */
	CustomField(String description, int value,String picture)
	{
		fieldDescription = description;
		fieldValue = value;
		fieldPicture = picture;
	}
	/**
	 * Sets the fieldDescription
	 * @param text
	 */
	public void setFieldText(String text)
	{
		fieldDescription = text;
	}
	
	/**
	 * Returns the fieldDescription
	 * @return fieldDescription
	 */
	public String getFieldText()
	{
		return fieldDescription;
		
	}
	/**
	 * Sets the fieldValue
	 * @param values
	 */
	public void setValuet(int values)
	{
		fieldValue = values;
	}
	/**
	 * Returns the fieldValue
	 * @return fieldValue
	 */
	public int getValueInt()
	{
		return fieldValue;
		
	}
	/**
	 * Returns the fieldPicture
	 * @return fieldPicture
	 */
	public String getPicture()
	{
		return fieldPicture;
	}
	/**
	 * Converts the fieldValue from integer to string
	 */
	public String getValueString()
	{
		return Integer.toString(fieldValue);
	}
}
