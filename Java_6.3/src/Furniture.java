abstract class Furniture {
    private String type;
    private double price;

    public Furniture(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public abstract void description();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}

class Chair extends Furniture {
    public Chair(String type, double price) {
        super(type, price);
    }

    @Override
    public void description() {
        System.out.println("This is a " + getType() + " priced at $" + getPrice());
    }
}

class Sofa extends Furniture {
    public Sofa(String type, double price) {
        super(type, price);
    }

    @Override
    public void description() {
        System.out.println("This is a " + getType() + " priced at $" + getPrice());
    }
}

class FurnitureShop {
    public void sell(Furniture furniture) {
        System.out.println("Selling furniture:");
        furniture.description();
    }
}