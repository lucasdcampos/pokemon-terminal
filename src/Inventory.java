import java.util.ArrayList;

public class Inventory {

  private ArrayList<Item> items;

  public Inventory(){
      this.items = new ArrayList<>();
  }

  public void addItem(String name, int quantity, int cost) {
      for (Item item : items) {
          if(item.getName().equals(name)) {
              item.setQuantity(item.getQuantity() + quantity);
          }
          return;
      }
      items.add(new Item(name, quantity, cost));
  }

  public void removeItem(String name, int quantity) {
      for (Item item : items) {
          if (item.getName().equals(name)){
              int newQuantity = item.getQuantity() - quantity;
              if (newQuantity <= 0) {
               items.remove(item);
              }
              else {
                  item.setQuantity(newQuantity);
              }
              return;
          }
      }
  }

  public void showInventory() {
      if (items.isEmpty()) {
          System.out.println("Tem nada aí");
      }
      else {
          System.out.println("Tu tem isso aí: ");
          for (Item item : items) {
              System.out.println(items);
          }
      }
  }

}
