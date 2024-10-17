import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Game game = new Game("Trainer");

        System.out.print("B - Battle, S - Shop, P - Pokemons, I - Inventory, Q - Quit\n> ");
        String input = scanner.nextLine();

        while (!input.equals("quit")) {
            System.out.print("B - Battle, S - Shop, P - Pokemons, I - Inventory, Q - Quit\n> ");
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
                default:
                    System.out.println("Invalid command!");
                    break;
            }
        }
        
        scanner.close();
    }
}