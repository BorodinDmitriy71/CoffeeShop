import java.util.Objects;

public class Recipe {
    int espressoPrice;
    double milkPrice;
    double readyDrink;

    public String makeRecipe(int order) {
        String orderName = "";
        if(Objects.equals(order, 2)) {
            espressoPrice = 2;
            milkPrice = 250;
            orderName = "Latte";
        }
        else if(Objects.equals(order, 1)) {
            espressoPrice = 1;
            milkPrice = 0;
            orderName = "Espresso";
        }
        else if(Objects.equals(order, 3)) {
            espressoPrice = 3;
            milkPrice = 250;
            orderName = "Flat White";
        }
        readyDrink = espressoPrice * 17 + milkPrice;

        return "Your " + orderName + " is ready, amount: " + readyDrink;
    }
}
