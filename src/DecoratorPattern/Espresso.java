package DecoratorPattern;

public class Espresso extends Beverage{
    //description instance variable is inherited from beverage
    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}