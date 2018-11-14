package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{

	private PokemonModel myPokemon;
	private PokemonModel defaultPokemon;
	private PokemonModel anotherPokemon;
	private ArrayList<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
	
	public PokemonController()
	{
		defaultPokemon = new PokemonModel(20, "water", "blue", false);
		pokemonList.add(defaultPokemon);
		
		myPokemon = new PokemonModel();
		
		anotherPokemon = new PokemonModel();
	}
	
	public void start()
	{
		lotsOfPokemon();
	
		for (PokemonModel pokemon : pokemonList)
		{
			JOptionPane.showMessageDialog(null, pokemon);
		}
		
	}
	
	private void lotsOfPokemon()
	{
		myPokemon.setLevel(myPokemon.generateLevel());
		myPokemon.setType(myPokemon.generateType());
		myPokemon.setColor(myPokemon.generateColor());
		myPokemon.setCanEvolve(myPokemon.generateCanEvolve());
		pokemonList.add(myPokemon);
		
		
		defaultPokemon.setLevel(defaultPokemon.generateLevel());
		defaultPokemon.setType(defaultPokemon.generateType());
		defaultPokemon.setColor(defaultPokemon.generateColor());
		defaultPokemon.setCanEvolve(defaultPokemon.generateCanEvolve());
		pokemonList.add(defaultPokemon);
	}
	
	//list of attributes
	//selectParameters method randomly selects ones from the list
	//PokemonLoop method calls the selectParameters method 3 times and puts each thing in the PokemonList
	//String description method
	//For each item in the PokemonList print out their associated descriptions (is that a thing you can do??)
	
}
