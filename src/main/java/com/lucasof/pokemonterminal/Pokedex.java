package com.lucasof.pokemonterminal;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Pokedex
{
    static List<PokemonData> pokemons; // apparently "pokemon" is already the plural of "pokemo"

    static void initializePokedex()
    {
        System.out.println("Initializing Pokedex, this can take a while..");
        
        pokemons = new ArrayList<PokemonData>();

        String jsonContent = readJsonFile("res/pokedex.json");
        JSONArray jsonArray = new JSONArray(jsonContent);

        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject jsonPokemon = jsonArray.getJSONObject(i);
            String name = jsonPokemon.getJSONObject("name").getString("english");
            JSONObject baseStats = jsonPokemon.getJSONObject("base");

            int baseHealth = baseStats.getInt("HP");
            int baseAttack = baseStats.getInt("Attack");
            int baseDefense = baseStats.getInt("Defense");
            int baseSpeed = baseStats.getInt("Speed");
            int baseSpAttack = baseStats.getInt("Sp. Attack");

            PokemonData p = new PokemonData(name, baseHealth, baseAttack, baseDefense, baseSpeed, baseSpAttack);
            pokemons.add(p);

            p.getString();
        }
    }

    private static String readJsonFile(String filePath) {
        String json = "";
        try {
			FileReader reader = new FileReader("res/pokedex.json");
			int data = reader.read();
			while(data != -1) {
				json += ((char)data);
				data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

        return json;
        
    }

    // for debug purposes only!
    private static void fillDebugPokemons() {
        PokemonData p1 = new PokemonData("Bulbasaur", 45, 49, 49, 45, 65);
        PokemonData p2 = new PokemonData("Charmander", 39, 52, 43, 65, 60);
        PokemonData p3 = new PokemonData("Squirtle", 44, 48, 65, 43, 50);

        pokemons.add(p1);
        pokemons.add(p2);
        pokemons.add(p3);
    }

    public static List<PokemonData> getPokemonList() {
        return pokemons;
    }

    public static PokemonData getRandomPokemon() {
        int random = Utils.randomInt(0, pokemons.size());

        return pokemons.get(random);
    }

}