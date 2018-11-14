package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{

	private PokemonModel myPokemon;
	private ArrayList<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
	
	public PokemonController()
	{
		myPokemon = new PokemonModel();
		
	}
	
	public void start()
	{
		lotsOfPokemon();
	
		for (PokemonModel pokemon : pokemonList)
		{
			JOptionPane.showMessageDialog(null, pokemon);
		}
		
	}
	
	public void lotsOfPokemon()
	{
		for (int timesRun = 1; timesRun < 8; timesRun ++)
		{
		//myPokemon.setDescription(generateDescription());
		myPokemon.setLevel(generateLevel());
		myPokemon.setType(generateType());
		myPokemon.setColor(generateColor());
		myPokemon.setCanEvolve(generateCanEvolve());
		
		pokemonList.add(myPokemon);
		myPokemon = new PokemonModel();
		
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
		
		String firstChar = type.substring(0, 1);
		if (firstChar.equalsIgnoreCase("a") || firstChar.equalsIgnoreCase("e") 
				|| firstChar.equalsIgnoreCase("i") || firstChar.equalsIgnoreCase("o") 
				|| firstChar.equalsIgnoreCase("u"))
		{
			type = "n " + type;
		}
		else
		{
			type = " " + type;
		}
		
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
		Boolean canEvolve = false; //default
		randomIndex = (int)(Math.random()*3);
		if (randomIndex % 10 == 0)
		{
			canEvolve = true;
		}
		return canEvolve;
	}
	
}
