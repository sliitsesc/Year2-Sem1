package designPatterns;

/**
 * @author chamodshehanka on 6/13/2019
 * @project Demo
 **/
public class Singleton {

    private static Singleton singleton;

    private Singleton(){
    }

    public Singleton getInstance(){
        if (singleton == null)
            singleton = new Singleton();
        return singleton;
    }

}
