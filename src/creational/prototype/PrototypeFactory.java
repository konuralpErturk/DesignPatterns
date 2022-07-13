package creational.prototype;

import java.util.HashMap;

public class PrototypeFactory {
    enum ModelTypes
    {
        MOVIE("movie"),
        ALBUM("album"),
        SHOW("show");

        ModelTypes(String type) {
            this.type = type;
        }

        private String type;
        String getType(){
            return this.type;
        }
    }

    private static HashMap<String,PrototypeCapable> prototypes = new HashMap<>();

    static
    {
        prototypes.put(ModelTypes.MOVIE.getType(),new Movie());
        prototypes.put(ModelTypes.ALBUM.getType(),new Album());
        prototypes.put(ModelTypes.SHOW.getType(),new Show());
    }

    public static PrototypeCapable getInstance(final String type) throws CloneNotSupportedException {
        return prototypes.get(type).clone();
    }
}
