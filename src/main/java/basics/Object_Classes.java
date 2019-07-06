package src.main.java.basics;

import basics.InitializationWithDefaults;

/**
 * Created by bhakal on 24/10/2018.
 */
public class Object_Classes {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println(2.0-1.1);
        System.out.println(a);

    }

    public static Object_Classes getObject(){
        Object_Classes object_classes = new Object_Classes();

        InitializationWithDefaults initializationWithDefaults = new InitializationWithDefaults();
        return object_classes;
    }


}
