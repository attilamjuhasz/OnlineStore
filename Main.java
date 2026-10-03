
public class Main
{
   //Your tests go here! I expect you to make sure various parts of your program work. 

     public static void main(String[] args)
     {
        Store s = new Store();
        Book b = new Book("All the Pretty Horses", 13.99, "October 3rd, 2026", "Penguin Random House", new Author(1882, "James Joyce"));
        System.out.println(b instanceof ItemForSale);

        Author a = new Author(1933, "Cormac McCarthy");

        b.setAuthor(a);

        System.out.println(b.getCreator());



        System.out.println(b.getPublisher());

        s.addItem(b);
        System.out.println(s.showItems());
        //s.sellItem(b);
        System.out.println(s.getProft());

        Movie m = new Movie("Interstellar", 34.99, "Christopher Nolan", "October 3rd, 2026", 0);
        System.out.println(m.getDuration());
        m.setDuration(169);
        System.out.println(m.getDuration());

        s.addItem(m);
        System.out.println(s.showItems());

        System.out.println(s.creator(b));

        s.sellItem(b);
        s.sellItem(m);
        System.out.println(s.getProft());

        ItemForSale item = new ItemForSale("GTA VI", 79.99, "Rockstar Games", "October 3rd, 2026");

        s.addItem(item);
        System.out.println(s.showItems());
        System.out.println(item.getDatePlacedOnSale());

        item.setDatePlacedOnSale("November 19th, 2026");
        System.out.println(item.getDatePlacedOnSale());

        System.out.println(a.getBirth());

        


     }
}
