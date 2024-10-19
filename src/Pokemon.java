public class Pokemon
{
    int level;
    PokemonData data;
    int HP;

    public Pokemon() {

    }

    public Pokemon(PokemonData data, int level) {
        this.data = data;
        this.level = level;
    }

    public Pokemon(PokemonData data) {
        this.data = data;
    }

    public PokemonData getData() {
        return data;
    }

    public int getHP() {
        return HP;
    }

}