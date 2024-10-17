import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("> ");
        String input = scanner.nextLine();

        while (!input.equals("quit")) {
            System.out.print("B - Battle, S - Shop, P - Pokemons, I - Inventory, Q - Quit\n> ");
            input = scanner.nextLine();
        }
        
        scanner.close();
    }
}