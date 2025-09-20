// Product interface
public interface Burger {
    void prepare();
}

// Concrete product 1
class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Cheese Burger with beef and cheddar cheese.");
    }
}

// Concrete product 2
class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Veggie Burger with fresh vegetables.");
    }
}

// Concrete product 3
class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Chicken Burger with grilled chicken.");
    }
}

// Abstract Creator
abstract class BurgerRestaurant {

    // Factory Method
    protected abstract Burger createBurger();

    // Uses factory method
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("Burger is ready to be served!\n");
    }
}

// Concrete Creator 1
class CheeseBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new CheeseBurger();
    }
}

// Concrete Creator 2
class VeggieBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
}

// Concrete Creator 3
class ChickenBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
}
