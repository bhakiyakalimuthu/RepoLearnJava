package basics.collectionutil;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-27
 */
public class IsArrayContainsValue {


    public static boolean isArrayContainsValue(String[] arr, String str){
        String[] arr1 = null;

        System.arraycopy(arr,1,arr1,2, 5);
        System.out.println(arr1.toString());
        if (Arrays.asList(arr).contains(str)) {
            return true;
        } else {
            return false;
        }
    }

    @Test
    public void isArrayContainsValueTest(){
        assertEquals(true,IsArrayContainsValue.isArrayContainsValue("hello".split(""),"o"));
    }

}
