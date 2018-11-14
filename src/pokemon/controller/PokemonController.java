package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokemonController 
{

	private PokemonModel myPokemon;
	
	public PokemonController()
	{
		myPokemon = new PokemonModel();
	}
	
	public void start()
	{
		
		
	}
	
	private void lotsOfPokemon()
	{
		ArrayList<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
		
		for (int index = 0; index < pokemonList.size(); index += 1)
		{
			pokemonList.add(myPokemon);
		}
		
		
	}
	
	//list of attributes
	//selectParameters method randomly selects ones from the list
	//PokemonLoop method calls the selectParameters method 3 times and puts each thing in the PokemonList
	//String description method
	//For each item in the PokemonList print out their associated descriptions (is that a thing you can do??)
	
}
