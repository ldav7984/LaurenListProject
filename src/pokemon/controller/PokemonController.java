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
		for (PokemonModel pokemon : pokemonList)
		{
			JOptionPane.showMessageDialog(null, myPokemon);
		}
		
	}
	
	private void lotsOfPokemon()
	{
		myPokemon.setLevel(myPokemon.generateLevel());
		myPokemon.setType(myPokemon.generateType());
		myPokemon.setColor(myPokemon.generateColor());
		myPokemon.setCanEvolve(myPokemon.generateCanEvolve());
		
		
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
