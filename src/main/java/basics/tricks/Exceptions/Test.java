package basics.tricks.Exceptions;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-28
 */
public class Test {
    private static final List<String> NAMES = new ArrayList<String>() {{
        add("John");
        System.out.println(NAMES);
    }};

    public static void main(String[] args) {
        System.out.println(Test.NAMES);
    }
}
