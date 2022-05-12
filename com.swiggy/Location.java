public class Location {

    private int x_lat;
    private int y_long;

    public Location(int x, int y)
    {
        this.x_lat = x;
        this.y_long = y;
    }

    public int getX_lat()
    {
        return this.x_lat;
    }

    public int getY_long()
    {
        return this.y_long;
    }

    public void setX_lat(int x)
    {
        this.x_lat = x;
    }

    public void setY_long(int y){

        this.y_long = y;
    }


    
}
