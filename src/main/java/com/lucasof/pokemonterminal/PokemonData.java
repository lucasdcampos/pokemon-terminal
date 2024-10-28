package com.lucasof.pokemonterminal;

public class PokemonData {
    String name;
    int health;
    int baseAttack;
    int defense;
    int speed;
    int specialAttack;

    public PokemonData() {

    }

    public PokemonData(String name, int health, int baseAttack, int defense, int speed, int specialAttack) {
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
        this.defense = defense;
        this.speed = speed;
        this.specialAttack = specialAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpecialAttack() {
        return specialAttack;
    }

    public String getString() {
        return "Name: " + name + " HP: " + health + " Attack: " + baseAttack + 
               " Defense: " + defense + " Speed: " + speed + " Sp. Attack: " + specialAttack;
    }
}
