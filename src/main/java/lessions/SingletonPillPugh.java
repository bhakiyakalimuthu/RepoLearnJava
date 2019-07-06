package src.main.java.lessions;

/**
 * Created by bhakal on 3/15/2017.
 */
public class SingletonPillPugh {

    private SingletonPillPugh(){};

    private static class SingletonHelper{
        private static  final SingletonPillPugh instance = new SingletonPillPugh();
    }

    public static SingletonPillPugh getInstance(){
        return SingletonHelper.instance;
    }
    public static void main(String[] args) {
        System.out.println("Returning singleton instance");
        SingletonPillPugh.getInstance();
    }


}
