package com.lucasof.pokemonterminal;
import org.json.JSONObject;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game();

        String input = "";

        while (!input.equals("quit")) {
            System.out.print("\nB - Battle, S - Shop, P - Pokemons, I - Inventory, Q - Quit\n> ");
            input = scanner.nextLine();

            switch(input)
            {
                case "B":
                    game.battle();
                    break;
                case "S":
                    game.shop();
                    break;
                case "P":
                    game.pokemons();
                    break;
                case "I":
                    game.inventory();
                    break;
                case "CLEAR":
                    clearConsole();
                    break;
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
        
        scanner.close();
    }
    
    public final static void clearConsole()
    {
        try
        {
            final String os = System.getProperty("os.name");
            
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }


}