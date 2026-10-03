public class ItemForSale
{

    protected String name;
    protected double price;
    protected String creator;
    protected String datePlacedOnSale;

    public ItemForSale(){
        name = "";
        price = 0.0;
        creator = "";
        datePlacedOnSale = "";
    }

    public ItemForSale(String name, double price, String creator, String datePlacedOnSale){
        this.name = name;
        this.price = price;
        this.creator = creator;
        this.datePlacedOnSale = datePlacedOnSale;
    }

    //Precondition: ItemForSale is defined and so is name
    //Postcondition: returns the name of the thing on sale
    public String getName(){
        return name;
    }

    //Precondition: ItemForSale and newName are defined
    //Postcondition: sets the name of the item to the inputted name
    public void setName(String newName){
        name = newName;
    }

    //Precondition: ItemForSale and price is defined
    //Postcondition: returns price of the item
    public double getPrice(){
        return price;
    }

    //Precondition: ItemForSale and newPrice are defined
    //Postcondition: sets price to new price
    public void setPrice(double newPrice){
        price = newPrice;
    }

    //Precondition: ItemForSale and creator is defined
    //Postcondition: returns creator of the item
    public String getCreator(){
        return creator;
    }

    //Precondition: ItemForSale and dateplacedonsale is defined
    //Postcondition: returns the date the item was placed on sale
    public String getDatePlacedOnSale(){
        return datePlacedOnSale;
    }

    //Precondition: ItemForSale and newDatePlacedOnSale are defined
    //Postcondition: sets the date placed on sale to a new date
    public void setDatePlacedOnSale(String newDatePlacedOnSale){
        datePlacedOnSale = newDatePlacedOnSale;
    }

}
