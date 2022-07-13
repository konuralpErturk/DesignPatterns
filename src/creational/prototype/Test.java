package creational.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        try {
            String moviePrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelTypes.MOVIE.getType()).toString();
            System.out.println(moviePrototype);

            String albumPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelTypes.ALBUM.getType()).toString();
            System.out.println(albumPrototype);

            String showPrototype = PrototypeFactory.getInstance(PrototypeFactory.ModelTypes.SHOW.getType()).toString();
            System.out.println(showPrototype);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
