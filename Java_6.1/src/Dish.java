abstract class Dish {
    private String material;
    private int size;

    public Dish(String material, int size) {
        this.material = material;
        this.size = size;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public int getSize() {
        return size;
    }
}

class Plate extends Dish {
    public Plate(String material, int size) {
        super(material, size);
    }

    @Override
    public void use() {
        System.out.println("Using a plate made of " + getMaterial() + " with size " + getSize());
    }
}

class Cup extends Dish {
    public Cup(String material, int size) {
        super(material, size);
    }

    @Override
    public void use() {
        System.out.println("Using a cup made of " + getMaterial() + " with size " + getSize());
    }
}