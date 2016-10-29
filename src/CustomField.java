
public class CustomField {
	
	private String fieldDescription;
	private int fieldValue;
	
	public CustomField(String description, int value)
	{
		fieldDescription = description;
		fieldValue = value;
	}
	
	public void setFieldText(String teksten)
	{
		fieldDescription = teksten;
	}
	
	public String getFieldText()
	{
		return fieldDescription;
		
	}
	
	public void setValuet(int values)
	{
		fieldValue = values;
	}
	
	public int getValue()
	{
		return fieldValue;
		
	}
}
