public class Kitchen {

    private String name;
    private Location location;
    private Dish[] menu;
    private Review[] reviews;

    public Kitchen(String name, Location location){

        this.name = name;
        this.location = location;

        this.menu = new Dish[10];
        this.reviews = new Review[10];

    }

    public String getName()
    {
        return this.name;
    }

    public Location getLocation()
    {
        return this.location;
    }

    public Dish[] getMenu()
    {

        return this.menu;
    }

    public Review[] getReview(){

            return this.reviews;
    }    

    public void setMenu(Dish[] menu)
    {
        this.menu = menu;
    }

    public void setReviews(Review[] reviews)
    {
        this.reviews = reviews;
    }

}
