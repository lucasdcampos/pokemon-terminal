public class Pokemon
{
    int level;
    PokemonData data;

    public Pokemon() {

    }

    public Pokemon(PokemonData data, int level) {
        this.data = data;
        this.level = level;
    }

    public Pokemon(PokemonData data) {
        this.data = data;
    }

}