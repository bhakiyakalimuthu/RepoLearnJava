package basics.polymorphism;

public class PolymorphismMain {

    public static void main(String[] args) {
        PolymorphismParent polymorphismParent = new PolymorphismChild();
        polymorphismParent.instanceMethod();
        polymorphismParent.classMethod();

    }
}
