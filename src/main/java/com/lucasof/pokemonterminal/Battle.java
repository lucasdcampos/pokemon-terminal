package com.lucasof.pokemonterminal;

import java.util.Scanner;

public class Battle {

    boolean active;
    Pokemon playerPokemon;
    Pokemon wildPokemon;

    public Battle(Pokemon player) {
        playerPokemon = player;
        wildPokemon = new Pokemon(Pokedex.getRandomPokemon());
    }

    public Pokemon start() {
        active = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wild " + wildPokemon.getData().getName() + " appeared!");

        playerPokemon.HP = playerPokemon.data.health;
        wildPokemon.HP = wildPokemon.data.health;

        while(active) {
            printBattleStatus();
            String input = scanner.nextLine();

            if(input.equals("1")) {
                attack();
            }
            else if(input.equals("2")) {
                flee();
            }

            else if(input.equals("3")) {
                if(capture()) {
                    return wildPokemon;
                }
            }
        }

        return null;
    }

    void attack() {

        int wildDamage = wildPokemon.takeDamage(playerPokemon.data.baseAttack);

        if( wildPokemon.HP <= 0) {
            System.out.println("You incapacitaded the Pokemon");
            active = false;
            return;
        }

        System.out.println("You attacked " + wildPokemon.data.name + "! -" + wildDamage + " HP");
    }

    void flee() {
        System.out.println("You flee!");
        active = false;
    }

    boolean capture() {
        float captureChance = (5 * (wildPokemon.data.health - wildPokemon.HP) / wildPokemon.data.health);
        captureChance = Math.min(captureChance, 1.0f);
        
        if (Math.random() < captureChance) {
            System.out.println("You captured " + wildPokemon.data.name + "!");
            return true;
        }

        System.out.println("Capture failed!");
        return false;    
    }

    void printBattleStatus() {
        Utils.printSeparator();
        Utils.printSplit(playerPokemon.getData().getName() + " (You):", wildPokemon.getData().getName(), 0);
        Utils.printSplit("LVL: " + playerPokemon.getLevel(), "LVL: " + wildPokemon.getLevel(), 0);
        Utils.printSplit("HP: " + playerPokemon.getHP(), "HP: " + wildPokemon.getHP(), 0);
        Utils.printSeparator();

        System.out.println("1: Attack | 2: Flee | 3: Use Item | 4: Capture\n");
        System.out.print("> ");
    }

}
