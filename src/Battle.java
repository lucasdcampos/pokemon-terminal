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
            scanner.nextLine();
            break;
        }
    }

    void printBattleStatus() {
        Utils.printSeparator();
        Utils.printSplit(playerPokemon.getData().getName() + " (You):", wildPokemon.getData().getName(), 0);
        Utils.printSplit("HP: " + playerPokemon.getHP(), "HP: " + wildPokemon.getHP(), 0);
        Utils.printSeparator();

        System.out.println("1: Attack | 2: Flee | 3: Use Item | 4: Capture\n");
        System.out.print("> ");
    }

}
