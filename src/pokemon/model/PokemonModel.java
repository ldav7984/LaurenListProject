package pokemon.model;

public class PokemonModel 
{
	private int level;
	private String type;
	private String color;
	private Boolean canEvolve;
	
	public Pokemon(int level, String type, String color, Boolean canEvolve)
	{
		this.level = level;
		this.type = type;
		this.color = color;
		this.canEvolve = canEvolve;
	}
	
	public int getLevel()
	{
		return level;
	}
	public String getType()
	{
		return type;
	}
	public String getColor()
	{
		return color;
	}
	public Boolean getCanEvolve()
	{
		return canEvolve;
	}
	
	public void setLevel(int level)
	{
		this.level = level;
	}
	public void setType(String type)
	{
		this.type = type;
	}
	public void setColor(String color)
	{
		this.color = color;
	}
	public void setCanEvolve(Boolean canEvolve)
	{
		this.canEvolve = canEvolve;
	}
	
}
