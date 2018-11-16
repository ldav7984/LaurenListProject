package pokemon.model;
import java.util.ArrayList;

import pokemon.controller.PokemonController;
import javax.swing.ImageIcon;

public class PokemonModel 
{
	private int level;
	private String type;
	private String color;
	private boolean canEvolve;
	private String description;
	
	private ArrayList<String> typesList;
	private ArrayList<String> colorsList;
	
	
	public PokemonModel()
	{
		this.level = 20;
		this.type = new String("water");
		this.color = new String("blue");
		this.canEvolve = false;
		
		this.typesList = new ArrayList<String>();
		this.colorsList = new ArrayList<String>();
		
		buildLists();
	}
	
	public PokemonModel(int level, String type, String color, boolean canEvolve, 
			ArrayList<String> typesList, ArrayList<String> colorsList)
	{
		this.typesList = getTypesList();
		this.colorsList = getColorsList();
		
		this.level = level;
		this.type = type;
		this.color = color;
		this.canEvolve = canEvolve;
		
		buildLists();
	}
	
	
	

	private void buildLists()
	{
		typesList.add("ice");
		typesList.add("electric");
		typesList.add("grass");
		typesList.add("water");
		typesList.add("poison");
		typesList.add("psychic");
		typesList.add("ghost");
		typesList.add("steel");
		typesList.add("ground");
		typesList.add("rock");
		typesList.add("normal");
		typesList.add("fairy");
		typesList.add("flying");
		typesList.add("bug");
		typesList.add("fire");
		typesList.add("fighting");
		typesList.add("dragon");
		typesList.add("dark");
		typesList.add("legendary");
		
		
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
		colorsList.add("tan");
		colorsList.add("turqoise");
		colorsList.add("magenta");
		colorsList.add("pink");
		colorsList.add("cyan");
		colorsList.add("aqua");
		colorsList.add("lilac");
		colorsList.add("gold");
		colorsList.add("lime");
		colorsList.add("teal");
		colorsList.add("apricot");
		colorsList.add("mint");
		colorsList.add("lavender");
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
	public boolean getCanEvolve()
	{
		return canEvolve;
	}
	public String getDescription()
	{
		return description;
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
	public void setDescription(String description)
	{
		this.description = description;
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
		String description = "This Pokemon is at level " + level + ","
				+ "\nit is a" + type + " type," 
				+ "\nit is the color " + color + ","
				+ "\nand it is " + canEvolve + " that this Pokemon can evolve.";
				return description;
	}
	
}
