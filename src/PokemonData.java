public class PokemonData
{
    String name;
    int health;
    int baseAttack;
    int defense;
    int speed;
    int specialAttack;

    public PokemonData() {

    }

    public PokemonData(String name, int health, int baseAttack, int defense, int speed, int specialAttack) {
        this.name = name;
        this.health = health;
        this.baseAttack = baseAttack;
        this.defense = defense;
        this.speed = speed;
        this.specialAttack = specialAttack;
    }

    public String getString()
    {
        return "Name: " + name + " HP: " + health + " Attack: " + baseAttack + " Defense: " + defense + " Speed: " + speed + " Sp. Attack: " + specialAttack;    
    }
}