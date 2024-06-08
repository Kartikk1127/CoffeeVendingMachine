public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = CoffeeMachine.getInstance();

        //display coffee menu
        coffeeMachine.displayMenu();

        //simulate user requests
        Coffee espresso = coffeeMachine.selectCoffee("Espresso");
        coffeeMachine.dispenseCoffee(espresso, new Payment(3.0));

        Coffee cappuccino = coffeeMachine.selectCoffee("Cappuccino");
        coffeeMachine.dispenseCoffee(cappuccino, new Payment(4.0));

        Coffee latte = coffeeMachine.selectCoffee("Latte");
        coffeeMachine.dispenseCoffee(latte, new Payment(5.0));
    }
}