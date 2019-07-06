package basics.polymorphism;

public class PolymorphismChild  extends PolymorphismParent{

    public static void classMethod() {
        System.out.println("classMethod() in Child");
    }

    public void instanceMethod(){
        System.out.println("instanceMethod() in Child");
    }

}
