package basics.tricks.instanceinit;

public class InstanceInitializerA {
    public InstanceInitializerA(String str){
        System.out.println("InstanceInitializerA : " + str + "\n" + "--------------------------------------------");
    }

    {
        System.out.println("InstanceInitializerA without access modifier1 ");
    }
    {
        System.out.println("InstanceInitializerA without access modifier2 ");
    }

    static {
        System.out.println("static InstanceInitializerA1 ");
    }
    static {
        System.out.println("static InstanceInitializerA2 "+ "\n" + "--------------------------------------------");
    }

//    public static InstanceInitializerA getInst(){
//        return new InstanceInitializerA("Test1");
//    }

}
