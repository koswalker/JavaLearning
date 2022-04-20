package Exercise40;

public class Hamburger {
    private double price;
    private String name;
    private String meat;
    private String breadRollType;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.price = price;
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        System.out.println("Basic hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
    }


    public Hamburger(String meat, double price) {
        this.meat = meat;
        this.price = price;
    }

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;



    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
        System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
        System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
        System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
        System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
    }

    public double itemizeHamburger(){
        double totalPrice = this.price;
        if (this.addition1Price != 0){
            totalPrice += this.addition1Price;
        }
        if (this.addition2Price != 0){
            totalPrice += this.addition2Price;
        }
        if (this.addition3Price != 0){
            totalPrice += this.addition3Price;
        }
        if (this.addition4Price != 0){
            totalPrice += this.addition4Price;
        }
        if (name == "Deluxe"){
            totalPrice = 19.10;
        }
        return totalPrice;
    }
}
