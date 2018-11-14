package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{

	private PokemonModel myPokemon;
	private PokemonModel defaultPokemon;
	private ArrayList<String> pokemonList = new ArrayList<String>();
	
	public PokemonController()
	{
		defaultPokemon = new PokemonModel();
		//pokemonList.add(defaultPokemon);
		
		myPokemon = new PokemonModel();
		
	}
	
	public void start()
	{
		lotsOfPokemon();
	
		for (String pokemonDescription : pokemonList)
		{
			JOptionPane.showMessageDialog(null, pokemonDescription);
		}
		
	}
	
	public void lotsOfPokemon()
	{
		for (int pokemonMade = 1; pokemonMade < 6; pokemonMade ++)
		{
		myPokemon.setDescription(generateDescription());
		pokemonList.add(myPokemon.getDescription());
		}
		
	}
	
	public int generateLevel()
	{
		int level = (int)(Math.random()*20);
		if(level < 1)
		{
			level = level + 1;
		}
		return level;
	}
	public String generateType()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random()*myPokemon.getTypesList().size());
		String type = myPokemon.getTypesList().get(randomIndex);
		return type;
	}
	public String generateColor()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random()*myPokemon.getColorsList().size());
		String color = myPokemon.getColorsList().get(randomIndex);
		return color;
	}
	public Boolean generateCanEvolve()
	{
		int randomIndex = 1; //default
		randomIndex = (int)(Math.random());
		Boolean canEvolve = false; //default
		if (randomIndex % 10 == 0)
		{
			canEvolve = true;
		}
		return canEvolve;
	}
	public String generateDescription()
	{
		myPokemon.setLevel(generateLevel());
		myPokemon.setType(generateType());
		myPokemon.setColor(generateColor());
		myPokemon.setCanEvolve(generateCanEvolve());
		String description = "This Pokemon is at level " + myPokemon.getLevel() + ","
				+ "\nit is a" + myPokemon.getType() + " type," //a" because they might need an n in the type for an
				+ "\nit is the color " + myPokemon.getColor() + ","
				+ "\nand it is " + myPokemon.getCanEvolve() + " that this Pokemon can evolve.";
		
		return description;
	}
	//list of attributes
	//selectParameters method randomly selects ones from the list
	//PokemonLoop method calls the selectParameters method 3 times and puts each thing in the PokemonList
	
}
