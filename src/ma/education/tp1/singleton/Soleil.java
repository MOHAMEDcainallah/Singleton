package ma.education.tp1.singleton;

public class Soleil {
    private static Soleil instance;
    public double surface;

    private Soleil(double surface){
        this.surface=surface;
    }

    public static Soleil getInstance(double surface){
        if(instance==null){
            instance=new Soleil(surface);
        }
        return instance;
    }
}
