import java.util.Scanner;

public class Battle {

    boolean active;
    Pokemon playerPokemon;
    Pokemon wildPokemon;

    public Battle(Pokemon player) {
        playerPokemon = player;
        wildPokemon = new Pokemon(Pokedex.getRandomPokemon());
    }

    public void start() {
        active = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wild " + wildPokemon.getData().getName() + " appeared!");

        
        while(active) {
            printBattleStatus();
            String input = scanner.nextLine();

            if(input.equals("1")) {
                attack();
            }
            else if(input.equals("2")) {
                flee();
            }
        }
    }

    void attack() {
        if(wildPokemon.takeDamage(100) <= 0) {
            System.out.println("You incapacitaded the Pokemon");
            active = false;
        }

    }

    void flee() {
        System.out.println("You flee!");
        active = false;
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
