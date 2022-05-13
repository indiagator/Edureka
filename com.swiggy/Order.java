public class Order {

    private String id;
    private Dish[] dish_list;
    private int order_amnt = 0;
    private Kitchen kitchen;
    private DeliveryGuy delGuy;
    private Customer customer;

    public Order(String id, Dish[] dish_list, Kitchen kitchen, Customer customer)
    {
        this.customer = customer;
        this.id = id;
        this.kitchen = kitchen;
        this.dish_list = dish_list;

        for(int i=0; i < dish_list.length; i++)
        {
            if(dish_list[i]!=null)
            {
                this.order_amnt = this.order_amnt + dish_list[i].getPrice();
            }
        }

        //please write code to set the total Order amount within the constructor - order_amnt
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getId() {
        return id;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public Dish[] getDish_list() {
        return dish_list;
    }

    public int getOrder_amnt() {
        return order_amnt;
    }

    public DeliveryGuy getDelGuy() {
        return delGuy;
    }

    public void setDelGuy(DeliveryGuy delGuy) {
        this.delGuy = delGuy;
    }
}