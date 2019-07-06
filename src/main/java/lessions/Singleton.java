package lessions;

/**
 * Hello world!
 *
 */
public class Singleton
{
    private static final Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        System.out.println("returning instance");
        return instance;
    }

    public static void main(String[] args) {
        Singleton.getInstance();
    }

}
