package basics.stringsarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-28
 */
public class ImportantStringArrayFunc {

    public static void main(String[] args) {

        ImportantStringArrayFunc.stringIntern();

    }

    public static void strbasics(){
        String str = "happy";

        System.out.println(str.indexOf("p"));
        System.out.println(str.substring(1));
        System.out.println(Arrays.asList(str));
        List<Integer> integerList = new ArrayList<>();
        System.out.println();
    }

    public static void strBuilder(){
        StringBuilder sb = new StringBuilder();

    }

    public static void stringIntern(){
        String aName = "Teemo";
        String bName = "Teemo";

// Checking for "referential equality" here
        if (aName == bName) {
            System.out.println("Strings are referentially equal");
        }
        String cName = bName.intern();

    }
}
