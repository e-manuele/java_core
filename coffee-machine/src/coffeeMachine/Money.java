package coffeeMachine;

public class Money {
  private int cents;

  public Money() {}

  public Money(Money money) {
    this.cents = money.getCents();
  }
  public Money(int cents) {
    this.cents = cents;
  }

  public int getCents() {
    return cents;
  }

  public void setCents(int cents) {
    this.cents = cents;
  }
}
