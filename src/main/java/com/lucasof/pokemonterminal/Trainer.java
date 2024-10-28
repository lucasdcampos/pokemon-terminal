package com.lucasof.pokemonterminal;

import java.util.ArrayList;
import java.util.List;

public class Trainer
{
    String name;
    List<Pokemon> pokemons;

    public Trainer() {
        setup();
    }

    void setup() {
        pokemons = new ArrayList<Pokemon>();
        addRandomPokemon();
        addRandomPokemon();
    }

    public void addRandomPokemon() {
        int randomIndex = Utils.randomInt((0), Pokedex.pokemons.size());
        PokemonData data = Pokedex.pokemons.get(randomIndex);

        Pokemon pokemon = new Pokemon(data);
        pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }
}