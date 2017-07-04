/**
 * Created by d.buetikofer on 04.07.2017.
 */
public class Singleton {

    private static Singleton instance = null;

    private String name;
    private String place;

    private Singleton(String n, String p){

        name = n;
        place = p;
    }

    public static Singleton getInstance(String n, String p){

        if(instance == null){
            instance = new Singleton(n, p);
        }
        return instance;
    }
}
