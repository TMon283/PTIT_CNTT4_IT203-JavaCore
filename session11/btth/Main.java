package session11.btth;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        Coffee coffee = new Coffee("D01", "Bạc sỉu", 30000, true);
        FruitJuice fruitJuice = new FruitJuice("D02", "Nước cam", 40000, 10);

        drinks[0] = coffee;
        drinks[1] = fruitJuice;
        drinks[2] = null;

        for (int i = 0; i < drinks.length; i++) {
            if (drinks[i] != null) {
                drinks[i].displayInfo();
                drinks[i].calculatePrice();
            }
            if (drinks[i] instanceof IMixable) {
                ((IMixable) drinks[i]).mix();
            }
        }
    }
}
