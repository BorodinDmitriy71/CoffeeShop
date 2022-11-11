public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        Recipe recipe = new Recipe();

        order.nameOfOrderer = "Dmitriy";

        order.showMenu();


        order.makeOrderID(order.nameOfOrderer);

        String showResult = recipe.makeRecipe(order.makeChoice("Latte"));


        System.out.println(showResult);
    }


}