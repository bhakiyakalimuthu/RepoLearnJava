package basics;

/**
 * Created by bhakal on 30/10/2018.
 */
public class InitializationWithDefaults {
    private boolean boolVar;
    private byte byteVar;
    private short shortVar;
    private int intVar;
    private long longVar;
    private float floatVar;
    private double doubleVar;
    private char charVar;
    private Object objectVar;
    private String stringVar;

    public InitializationWithDefaults(){
        super();
        System.out.println(" boolVar : "+boolVar);
        System.out.println(" byteVar "+byteVar);
        System.out.println(" shortVar: "+shortVar);
        System.out.println(" intVar: "+intVar);
        System.out.println(" intVar: "+intVar);
        System.out.println(" floatVar: "+floatVar);
        System.out.println(" doubleVar: "+doubleVar);
        System.out.println(" charVar: "+charVar);
        System.out.println(" objectVar: "+objectVar);
        System.out.println(" stringVar: "+stringVar);
    }

    public static void main(String[] args) {
        InitializationWithDefaults initializationWithDefaults = new InitializationWithDefaults();
    }

}
