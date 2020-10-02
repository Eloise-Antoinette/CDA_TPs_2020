package testclasses;

public class Sheep extends Animal {
	public String wool;
	
	public Sheep()
	{
		this.wool = "sqqd";
		this.type = "sheep";
	}
	public Sheep(String s)
	{
		super(s);
	}
	
	public String getType()
	{
		System.out.println("CALLS");
		return this.type;
	}
	
	public String getWool()
	{
		return this.wool;
	}
	
	
	public void baa()
	{
		System.out.println("bAAA");
	}
	
}
