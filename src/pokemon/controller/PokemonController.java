package pokemon.controller;

import pokemon.model.PokemonModel;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

import pokemon.model.PokemonModel;

public class PokemonController 
{
	private PokemonModel[] pokemonArray;
	private ImageIcon [] icons;
	
	private PokemonModel myPokemon;
	private ArrayList<PokemonModel> pokemonList = new ArrayList<PokemonModel>();
	
	
	public PokemonController()
	{
		myPokemon = new PokemonModel();
		
		icons = new ImageIcon[1];
		icons[0] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		//icons[1] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		//icons[2] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		//icons[3] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		//icons[4] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		//icons[5] = new ImageIcon(getClass().getResource("/pokemon/view/images/pokeball.png"));
		
		pokemonArray = new PokemonModel[10];
		
		
		
	}
	
	
	
	public void start()
	{
		arrayInitialization();
		
		lotsOfPokemon();
	
		//for (PokemonModel pokemon : pokemonList)
		//{
		//	JOptionPane.showMessageDialog(null, pokemon);
		//}
		JOptionPane.showMessageDialog(null,  "",  "Arrays",  JOptionPane.INFORMATION_MESSAGE, icons[0]);
		
	}
	
	private void arrayInitialization() //just sets default values
	{
		
		for (int index = 0; index == pokemonArray.length; index += 1)
		{
			pokemonArray[index] = new PokemonModel();
		}
		
	}
	
	public void lotsOfPokemon()
	{
		for (int index = 0; index < pokemonArray.length; index += 1)
		{
		myPokemon.setLevel(generateLevel());
		myPokemon.setType(generateType());
		myPokemon.setColor(generateColor());
		myPokemon.setCanEvolve(generateCanEvolve());
		pokemonList.add(myPokemon);
		
		pokemonArray[index] = new PokemonModel(myPokemon.getLevel(), myPokemon.getType(), myPokemon.getColor(), 
					myPokemon.getCanEvolve(), myPokemon.getTypesList(), myPokemon.getColorsList());
		
		myPokemon = new PokemonModel();
		
		//if (index % 2 == 0)
		//{
		//	pokemonArray[index] = new PokemonModel();
		//}
		//else
		//{
		//	pokemonArray[index] = new PokemonModel(myPokemon.getLevel(), myPokemon.getType(), myPokemon.getColor(), 
		//			myPokemon.getCanEvolve(), myPokemon.getTypesList(), myPokemon.getColorsList());
		//}
		
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
		
		//if the type begins with a vowel then the type will have "n " added to the front of it.
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
	public boolean generateCanEvolve()
	{
		int randomIndex = 1; //default
		boolean canEvolve = false; //default
		//randomIndex = (int)(Math.random()*100);
		if ((int)(Math.random()*100) % 2 == 0)
		{
			canEvolve = true;
		}
		return canEvolve;
	}
	
}
