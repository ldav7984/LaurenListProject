package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{

	private PokemonModel myPokemon;
	private PokemonModel defaultPokemon;
	//private PokemonModel anotherPokemon;
	private ArrayList<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
	
	public PokemonController()
	{
		defaultPokemon = new PokemonModel(20, "water", "blue", false);
		pokemonList.add(defaultPokemon);
		
		myPokemon = new PokemonModel();
		
		//anotherPokemon = new PokemonModel();
	}
	
	public void start()
	{
		lotsOfPokemon();
	
		for (PokemonModel pokemon : pokemonList)
		{
			JOptionPane.showMessageDialog(null, pokemon.toString());
		}
		
	}
	
	public void lotsOfPokemon()
	{
		for (int pokemonMade = 1; pokemonMade < 4; pokemonMade ++)
		{
		myPokemon.setLevel(generateLevel());
		myPokemon.setType(generateType());
		myPokemon.setColor(generateColor());
		myPokemon.setCanEvolve(generateCanEvolve());
		pokemonList.add(myPokemon);
		}
		
		//anotherPokemon.setLevel(generateLevel());
		//anotherPokemon.setType(generateType());
		//anotherPokemon.setColor(generateColor());
		//anotherPokemon.setCanEvolve(generateCanEvolve());
		//pokemonList.add(anotherPokemon);
	}
	
	public int generateLevel()
	{
		int level = (int)(Math.random());
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
	//list of attributes
	//selectParameters method randomly selects ones from the list
	//PokemonLoop method calls the selectParameters method 3 times and puts each thing in the PokemonList
	
}
