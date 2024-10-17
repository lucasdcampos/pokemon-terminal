public class Game
{
    String trainerName;
    String currentLocation;

    public Game(String name) {
        trainerName = name;

        setup();
    }

    void setup() {

        Pokedex.initializePokedex();


    }

    public void battle() {

    }

    public void shop() {

    }

    public void pokemons() {

    }
    
    public void inventory() {
        
    }

    public void travelTo(String location) {
        currentLocation = location;
    }


}