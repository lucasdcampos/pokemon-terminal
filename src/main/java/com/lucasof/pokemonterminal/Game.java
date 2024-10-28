package com.lucasof.pokemonterminal;

public class Game
{
    Trainer trainer;
    String currentLocation;

    public Game() {
        setup();
    }

    void setup() {

        Pokedex.initializePokedex();

        trainer = new Trainer();
        
    }

    public void battle() {
        Battle battle = new Battle(trainer.getPokemons().get(0));
        Pokemon wildPokemon = battle.start();

        // not null means we captured a pokemon in the battle
        if(wildPokemon != null) {
            trainer.pokemons.add(wildPokemon);
        }
    }

    public void shop() {

    }

    public void pokemons() {
        Utils.printSeparator();
        System.out.println("Your pokemons:");
        for(Pokemon pokemon : trainer.getPokemons())
        {
            System.out.println(pokemon.data.getString());
        }
        Utils.printSeparator();
    }

    public void inventory() {
        
    }

    public void travelTo(String location) {
        currentLocation = location;
    }

}