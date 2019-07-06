package basics.tricks.covariantreturn;

public class Shape {
    public Shape getShape(){
        return new Shape();
    }
}
