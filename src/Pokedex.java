import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Pokedex
{
    static PokemonData[] pokemons; // apparently "pokemon" is already the plural of "pokemo"

    static void initializePokedex()
    {
        try {
            File pokemonJson = new File("C:\\dev\\pokemon-terminal\\res\\pokedex.json");
            Scanner myReader = new Scanner(pokemonJson);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Erro");
            e.printStackTrace();
        }


        fillDebugPokemons();
    }

    // for debug purposes only!
    static void fillDebugPokemons() {
        PokemonData p1 = new PokemonData("Bulbasaur", 45, 49, 49, 45, 65);
        PokemonData p2 = new PokemonData("Charmander", 39, 52, 43, 65, 60);
        PokemonData p3 = new PokemonData("Squirtle", 44, 48, 65, 43, 50);

        pokemons = new PokemonData[3];
        pokemons[0] = p1;
        pokemons[1] = p2;
        pokemons[2] = p3;
    }

    public static PokemonData[] getPokemonList() {
        return pokemons;
    }

    public static PokemonData getRandomPokemon() {
        int random = Utils.randomInt(0, pokemons.length);

        return pokemons[random];
    }

}