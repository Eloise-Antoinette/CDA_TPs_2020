package testclasses;

public class Animal {

	protected String type;

	protected String name;
	
	public Animal()
	{
	}
	
	public Animal(String n)
	{
		this.name = n;
	}
	
	public String getType()
	{
		return this.type;
	}
	
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
}
