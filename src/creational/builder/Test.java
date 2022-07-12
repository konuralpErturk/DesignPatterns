package creational.builder;

public class Test {
    public static void main(String[] args) {
        Menu adultMenu = new Menu.MenuBuilder("BigMac","Onion Ring","Coca Cola").build();
        System.out.println(adultMenu.toString());
        Menu childMenu = new Menu.MenuBuilder("BigMac","Onion Ring","Coca Cola").toy("car").build();
        System.out.println(childMenu.toString());
    }
}
