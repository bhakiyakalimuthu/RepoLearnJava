package basics.polymorphism;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-29
 */
public interface Face3 extends Face2,Face1{
    public void face3();


    @Override
    default void face1() {

    }

    @Override
    default void face2() {

    }

    @Override
    default void face() {
    }
}
