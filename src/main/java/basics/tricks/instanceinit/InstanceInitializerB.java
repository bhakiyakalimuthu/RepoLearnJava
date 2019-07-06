package basics.tricks.instanceinit;

public class InstanceInitializerB extends InstanceInitializerA {


    public InstanceInitializerB(String str){
        super("Test1");
        System.out.println("InstanceInitializerB : " + str + "\n" + "--------------------------------------------");
    }

    {

        System.out.println("InstanceInitializerB without access modifier1 ");
    }
    {
        System.out.println("InstanceInitializerB without access modifier2 ");
    }

    static {
        System.out.println("static InstanceInitializerB1 ");
    }
    static {
        System.out.println("static InstanceInitializerB2 "+ "\n" + "--------------------------------------------");
    }
    public static void main(String[] args) {

        new InstanceInitializerB("Test2");
    }

}
