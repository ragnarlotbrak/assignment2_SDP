import factory.CarFactory;
import factory.SedanFactory;
import factory.SUVFactory;

public class Main {
    public static void main(String[] args) {

        CarFactory sedanFactory = new SedanFactory();
        sedanFactory.testDrive();

        CarFactory suvFactory = new SUVFactory();
        suvFactory.testDrive();
    }
}