package coffeeMachine;


public class CoffeeMachine {
  Coffee[] menu;
  private boolean isCoffeeAvailable;
  private int coffeePrice;
  private final Money money;

  public CoffeeMachine() {
    this.money = new Money();
  }
  public CoffeeMachine(Coffee[] menu) {
    this.menu = menu;
    this.money = new Money();
  }

  public Coffee makeCoffee() {
    if (isCoffeeAvailable) {
      if (money.getCents() >= coffeePrice) {
        System.out.println("Coffee is coming!");
        money.setCents(money.getCents() - coffeePrice);
        return new Coffee();
      } else {
        System.out.println("Money is not enough to pay the coffee");
        return null;
      }
    } else {
      System.out.println("Coffee is not available");
      return null;
    }
  }
  public Coffee makeThisCoffee(String coffeeName) {
    if (isCoffeeAvailable) {
      for (Coffee caffe : this.menu) {
        if (caffe.nome.equals( coffeeName)) {
          if (money.getCents() >= caffe.price.getCents()) {
            System.out.println(coffeeName+" is coming!");
            money.setCents(money.getCents() - coffeePrice);
            return new Coffee( caffe.price, caffe.nome);
          } else {
            System.out.println("Money is not enough to pay the coffee");
            return null;
          }
        }
    }System.out.println("Selected coffe does not exist");
    }else {
          System.out.println("Coffee is not available");
          return null;
        }
    return null;
  }


  protected void setCoffeeAvailable(boolean isCoffeeAvailable) {
    this.isCoffeeAvailable = isCoffeeAvailable;
  }

  public boolean getCoffeeAvailable() {
    return this.isCoffeeAvailable;
  }

  protected void setCoffeePrice(int coffeePrice) {
    this.coffeePrice = coffeePrice;
  }

  public void setMoney(int cents) {
    this.money.setCents(cents);
  }

  public Money returnChange() {
    Money change = new Money(money);
    money.setCents(0);
    return change;
  }
}
