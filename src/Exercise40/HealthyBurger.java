package Exercise40;

public class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger (String meat, double price){
        super(meat, price);
        System.out.println("Healthy hamburger on a Brown rye roll with " + meat + ", price is " + price);
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
        System.out.println("Added " + this.healthyExtra1Name  + " for an extra " + this.healthyExtra1Price);
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
        System.out.println("Added " + this.healthyExtra2Name  + " for an extra " + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.healthyExtra2Price != 0){
            totalPrice += this.healthyExtra2Price;
        }
        if (this.healthyExtra1Price != 0){
            totalPrice += this.healthyExtra1Price;
        }
        return totalPrice;
    }
}
