public class Item {
    private String name;
    private int quantity;
    private int cost;

    public Item(String name, int quantity, int cost){
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public String getName(){
        return name;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public String toString() {
        return name + "X" + quantity;
    }
}
