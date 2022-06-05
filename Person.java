import java.util.ArrayList;

public class Person {
	private Character characterType;
	private String status;
	
	public Person()
	{
		characterType = null;
		status = " ";
	}
	
	public Person(Character type, String stat) {
		characterType = type;
		status = stat;
	}
	
	/**public void setCharacterType(character);
	{
		characterType = character;
	}
	**/
	
	/**public void setStatus(stats)
	{
		status = stats;
	}
	**/
	public Character getCharacterType()
	{
		return characterType;
	}
	
	public String getStatus()
	{
		return status;
	}

}
