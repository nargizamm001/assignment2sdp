// Burger.java
// Example of Factory Method Pattern with burgers

// Product interface (common contract for all burgers)
public interface Burger {
    void prepare();
}

// Concrete product 1 (specific burger type)
class CheeseBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Cheese Burger with beef and cheddar cheese.");
    }
}

// Concrete product 2 (another burger type)
class VeggieBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Veggie Burger with fresh vegetables.");
    }
}

// Concrete product 3 (another burger type)
class ChickenBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing a Chicken Burger with grilled chicken.");
    }
}

// Abstract Creator (defines factory method to create burgers)
abstract class BurgerRestaurant {

    // Factory Method (subclasses decide what burger to create)
    protected abstract Burger createBurger();

    // High-level logic (uses the created burger)
    public void orderBurger() {
        Burger burger = createBurger();
        burger.prepare();
        System.out.println("Burger is ready to be served!\n");
    }
}

// Concrete Creator 1 (creates CheeseBurger)
class CheeseBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new CheeseBurger();
    }
}

// Concrete Creator 2 (creates VeggieBurger)
class VeggieBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new VeggieBurger();
    }
}

// Concrete Creator 3 (creates ChickenBurger)
class ChickenBurgerRestaurant extends BurgerRestaurant {
    @Override
    protected Burger createBurger() {
        return new ChickenBurger();
    }
}
