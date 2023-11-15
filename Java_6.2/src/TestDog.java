public class TestDog {
    public static void main(String[] args) {
        Dog goldenRetriever = new GoldenRetriever("Golden Retriever", 3);
        Dog bulldog = new Bulldog("Bulldog", 2);

        goldenRetriever.bark();
        bulldog.bark();
    }
}
