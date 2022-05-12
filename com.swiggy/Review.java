public class Review {

    private  String comment;
    private  int rating; //out of 5

    public Review(String comment, int rating)
    {
        this.comment = comment;
        this.rating = rating;

    }

    public String getComment()
    {
        return this.comment;
    }

    public int getRating()
    {
        return this.rating;
    }
    
}
