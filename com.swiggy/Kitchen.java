public class Kitchen {

    private String name;
    private Location location;
    private Dish[] menu;
    private Review[] reviews;

    private int cookingTime = 30; //minutes

    public Kitchen(String name, Location location){

        this.name = name;
        this.location = location;

        this.menu = new Dish[10];
        this.reviews = new Review[10];

    }
    public int getCookingTime() {
        return this.cookingTime;
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

    public double getAvgRating()
    {
        double avgRating;

        int ratingSum = 0;

        int i = 0;
        while(reviews[i]!=null)
        {
            ratingSum = ratingSum + reviews[i].getRating();
            i++;
        }

        avgRating = ratingSum/i;

        return avgRating;

    }

}
