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
        battle.start();
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