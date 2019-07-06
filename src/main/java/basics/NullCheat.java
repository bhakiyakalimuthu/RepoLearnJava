package basics;

/**
 * Created by bhakal on 12/11/2018.
 */
public class NullCheat {

    public static String a ;

    public static void main(String[] args) {

        assert a == null:"not null";
        System.out.println(a);
        Object x = new Object();
        assert x !=null: "null";
        System.out.println(x);

        {
            String s = null;
            boolean fail = false;
            try {
                s.toLowerCase();
            } catch (NullPointerException e) {
                assert e.getClass() == NullPointerException.class;
                fail = true;
            }
            assert fail;
        }
    }
}
