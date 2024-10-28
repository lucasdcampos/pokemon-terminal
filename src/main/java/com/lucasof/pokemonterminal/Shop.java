package com.lucasof.pokemonterminal;

public class Shop {

    static int pokebola = 3;

    static void buy() {


    }

    static void sell(){

        if (pokebola == 0) {
            System.out.println("Você pode vender");
        }
        else {
            System.out.println("Você não tem Pokebola para vender");
        }
    }
}
