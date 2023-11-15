abstract class Dog {
    private String breed;
    private int age;

    public Dog(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    public abstract void bark();

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }
}

class GoldenRetriever extends Dog {
    public GoldenRetriever(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void bark() {
        System.out.println("Golden Retriever is barking.");
    }
}

class Bulldog extends Dog {
    public Bulldog(String breed, int age) {
        super(breed, age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog is barking.");
    }
}
