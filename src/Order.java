import java.util.Random;

public class Order extends Menu{
    public String nameOfOrderer;
    public int orderID;
    Random random = new Random();

    public int makeOrderID(String menu) {
        orderID = random.nextInt(0, 10);

        return orderID;
    }
}
