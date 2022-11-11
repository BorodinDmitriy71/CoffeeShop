public class Menu {
    int choiceNum;
    public void showMenu() {
        System.out.println("Espresso - 100 rubles");
        System.out.println("Latte - 200 rubles");
        System.out.println("Flat White - 300 rubles");
    }

    public int makeChoice(String choice) {
        if(choice.equals("Espresso")) {
            choiceNum = 1;
        }
        else if(choice.equals("Latte")) {
            choiceNum = 2;
        }
        if(choice.equals("Flat White")) {
            choiceNum = 3;
        }

        return choiceNum;
    }
}

