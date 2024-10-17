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

    }

    public void shop() {

    }

    public void pokemons() {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Your pokemons:");
        for(Pokemon pokemon : trainer.getPokemons())
        {
            System.out.println(pokemon.data.getString());
        }
        System.out.println("----------------------------------------------------------------------");
    }

    public void inventory() {
        
    }

    public void travelTo(String location) {
        currentLocation = location;
    }

}