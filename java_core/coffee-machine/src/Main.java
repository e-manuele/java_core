import coffeeMachine.Coffee;
import coffeeMachine.CoffeeMachine;
import coffeeMachine.MachineTechnician;
import coffeeMachine.Money;
public class Main {

    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.makeCoffee();
        System.out.println(coffeeMachine.getCoffeeAvailable());
        MachineTechnician machineTechnician = new MachineTechnician(coffeeMachine);
        machineTechnician.refillCoffee();
        machineTechnician.setCoffeePrice(60);
        System.out.println(coffeeMachine.getCoffeeAvailable());
        coffeeMachine.makeCoffee();
        coffeeMachine.setMoney(60);
        coffeeMachine.makeCoffee();


        Coffee cappuccino = new Coffee(new Money(80),"Cappuccino");
        Coffee espresso = new Coffee(new Money(50),"espresso");
        Coffee[] menu = {cappuccino, espresso};
        CoffeeMachine coffeeMachine1 = new CoffeeMachine(menu);
        MachineTechnician machineTechnician1 = new MachineTechnician(coffeeMachine1);
        machineTechnician1.refillCoffee();
        coffeeMachine1.setMoney(90);
        coffeeMachine1.makeThisCoffee("espresso");





    }

}