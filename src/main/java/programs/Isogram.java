package programs;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-26
 */
public class Isogram {

    public static boolean  isIsogram(String str) {
        // ...
        if(str.isEmpty()){
            return true;
        }
        Pattern p = Pattern.compile("[0-9]");
        if(p.matcher(str).find() || str.length() > 26){
            return false;
        }

        String[] strA = str.toLowerCase().split("");
        System.out.println(Arrays.asList(strA));
        Set set = new HashSet(Arrays.asList(strA));
        Set set1 = new LinkedHashSet(Arrays.asList(strA));
        Set set2 = new TreeSet(Arrays.asList(strA));
        System.out.println("hashset : " +set.toString());
        System.out.println("Linkedhashset : " +set1.toString());
        System.out.println("treeset : " +set2.toString());
        if(set.size() == str.length()){
            return true;
        }

        return false;
    }

    public static boolean isIsogram1(String str){

        if(str.isEmpty()){
            return true;
        }
        Pattern p = Pattern.compile("[0-9]");
        if(p.matcher(str).find() || str.length() > 26){
            return false;
        }

        for (int i=1; i < str.length(); i++) {
            if(str.toLowerCase().substring(i).indexOf(str.charAt(i-1)) != -1){
                return false;
            }
        }
        return true;
    }
    @Test
    public void FixedTests() {
        assertEquals(true, Isogram.isIsogram("Dermatoglyphics"));
        assertEquals(true, Isogram.isIsogram("Isogram"));
        assertEquals(false, Isogram.isIsogram("moose"));
        assertEquals(false, Isogram.isIsogram("isIsogram"));
        assertEquals(false, Isogram.isIsogram("aba"));
        assertEquals(false, Isogram.isIsogram("moOse"));
        assertEquals(true, Isogram.isIsogram("thumbscrewjapingly"));
        assertEquals(true, Isogram.isIsogram(""));
        assertEquals(true, Isogram.isIsogram("cdemnopqrstuvwxyzabfghijkl"));
    }
    
    
}
