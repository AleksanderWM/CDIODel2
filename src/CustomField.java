
public class CustomField {
	
	private String fieldDescription;
	private int fieldValue;
	private String fieldPicture;
	
	public CustomField(String description, int value,String picture)
	{
		fieldDescription = description;
		fieldValue = value;
		fieldPicture = picture;
		
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
	
	public int getValueInt()
	{
		return fieldValue;
		
	}
	
	public String getPicture()
	{
		return fieldPicture;
	}
	public String getValueString()
	{
		return Integer.toString(fieldValue);
	}
}
