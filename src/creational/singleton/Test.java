package creational.singleton;

public class Test {
    public static void main(String[] args) {
        //creational.singleton patterns not create object if object is exist
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        System.out.println(logger1.hashCode());
        System.out.println(logger2.hashCode());
    }
}
