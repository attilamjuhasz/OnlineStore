public class Movie extends ItemForSale
{

    private double duration;

    public Movie(){
        duration = 0.0;
    }

    public Movie(String name, double price, String creator, String datePlacedOnSale, double duration){
        super(name, price, creator, datePlacedOnSale);
        this.duration = duration;
    }


    //Precondition: Movie and duration is defined
    //Postcondition: returns the duration of the movie
    public double getDuration(){
        return duration;
    }

    //Precondition: Movie and newDuration is defined
    //Postcondition: sets a new duration for the film
    public void setDuration(double newDuration){
        duration = newDuration;
    }


}
