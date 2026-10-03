/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/
import java.util.ArrayList;

public class Store
{
  
  private double profit;
  private ArrayList<ItemForSale> items;

  public Store(){
    profit = 0.0;
    items = new ArrayList<>();
  }

  public Store(ArrayList<ItemForSale> items){
    this.items = items;
    profit = 0.0;
  }

  //precondition: Store and items are defined
  //postcondition: returns a string with the names of all of the items for sale
  public String showItems(){
    String strOfItems = "";

    for (int i = 0; i < items.size(); i++){
      if (i == items.size() - 1){
        strOfItems = strOfItems + items.get(i).getName();
      }
      else{
        strOfItems = strOfItems + items.get(i).getName() + ", ";
      }
    }

    return strOfItems;
  }

  //Precondition: Items and Store is defined
  //Postcondition: Adds the inputted item into the items list and puts it on sale
  public void addItem(ItemForSale item){
    items.add(item);
  }

  //Precondition: Items and profit and store is defined
  //Postcondition: Removes item from the items on sale list and adds the items price to the profit of the store
  public void sellItem(ItemForSale item){
    profit += item.getPrice();
    items.remove(item);
  }

  //Precondition: Item and Store is deifned
  //Postcondition: Returns the creator of the item
  public String creator(ItemForSale item){
    return item.getCreator();
  }

  //Precondition: Store and profit is defined
  //Postcondition: The profit of the store is returned
  public double getProft(){
    return profit;
  }

}