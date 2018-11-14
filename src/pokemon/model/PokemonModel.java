package pokemon.model;
import java.util.ArrayList;

public class PokemonModel 
{
	private int level;
	private String type;
	private String color;
	private Boolean canEvolve;
	private ArrayList<String> typesList;
	private ArrayList<String> colorsList;
	
	public PokemonModel()
	{
		buildLists();
	}
	
	public PokemonModel(int level, String type, String color, Boolean canEvolve)
	{
		buildLists();
		this.level = level;
		this.type = type;
		this.color = color;
		this.canEvolve = canEvolve;
		//buildLists();
	}
	
	public int generateLevel()
	{
		level = (int)(Math.random());
		//setLevel(level);
		return level;
	}
	public String generateType()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random()*typesList.size());
		setType(typesList.get(randomIndex));
		return type;
	}
	public String generateColor()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random()*colorsList.size());
		setColor(colorsList.get(randomIndex));
		return color;
	}
	public Boolean generateCanEvolve()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random());
		canEvolve = false; //defeault
		if (randomIndex % 10 == 0)
		{
			canEvolve = true;
		}
		
		return canEvolve;
	}
	

	private void buildLists()
	{
		typesList.add(" grass");
		typesList.add(" water");
		typesList.add(" n ice");
		typesList.add(" electric");
		typesList.add(" poison");
		typesList.add(" psychic");
		typesList.add(" ghost");
		typesList.add(" steel");
		typesList.add(" ground");
		typesList.add(" rock");
		typesList.add(" normal");
		typesList.add(" fairy");
		typesList.add(" flying");
		typesList.add(" bug");
		typesList.add(" fire");
		typesList.add(" fighting");
		typesList.add(" dragon");
		typesList.add(" dark");
		
		
		colorsList.add("green");
		colorsList.add("red");
		colorsList.add("blue");
		colorsList.add("yellow");
		colorsList.add("gray");
		colorsList.add("orange");
		colorsList.add("purple");
		colorsList.add("yellow");
		colorsList.add("white");
		colorsList.add("black");
		colorsList.add("brown");
		colorsList.add("magenta");
		colorsList.add("pink");
		colorsList.add("lime");
		colorsList.add("aqua");
		colorsList.add("lilac");
		colorsList.add("gold");
		colorsList.add("neon");
		
		
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
	public ArrayList<String> getTypesList()
	{
		return typesList;
	}
	public ArrayList<String> getColorsList()
	{
		return colorsList;
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
	public void setTypesList(ArrayList<String> typesList)
	{
		this.typesList = typesList;
	}
	public void setColorsList(ArrayList<String> colorsList)
	{
		this.colorsList = colorsList;
	}
	
	
	public String toString()
	{
		String description = "This Pokemon is at level " + level + "."
				+ "\nIt is a" + type + " type." //a" because they might need an n in the type for an
				+ "\nIt is the color " + color + ","
				+ "\nand it is " + canEvolve + " that this Pokemon can evolve.";
				return description;
	}
	
}
