// Main.java
// Client code that uses the Factory Method pattern
public class Main {
    public static void main(String[] args) {

        // Order from Cheese Burger Restaurant
        BurgerRestaurant cheeseRestaurant = new CheeseBurgerRestaurant();
        cheeseRestaurant.orderBurger();

        // Order from Veggie Burger Restaurant
        BurgerRestaurant veggieRestaurant = new VeggieBurgerRestaurant();
        veggieRestaurant.orderBurger();

        // Order from Chicken Burger Restaurant
        BurgerRestaurant chickenRestaurant = new ChickenBurgerRestaurant();
        chickenRestaurant.orderBurger();
    }
}
