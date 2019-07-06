package basics.stringsarrays;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-01
 */
public class Anagrams {

    public static void main(String[] args) {
        System.out.println(Anagrams.isAnagram("army","mary"));
    }

    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        List<String> list = new ArrayList<String>(Arrays.asList(str1.split("")));
        for (int i = 0; i <str2.length() ; i++) {
            if(!list.contains(str2.charAt(i)+"")){
                return false;
            }
        }
        return true;
    }

    @Test 
    public void testIAnagram() {
        assertTrue(Anagrams.isAnagram("word", "wrdo"));
        assertTrue(Anagrams.isAnagram("boat", "btoa"));
        assertFalse(Anagrams.isAnagram("pure", "in"));
        assertFalse(Anagrams.isAnagram("fill", "fil"));
        assertTrue(Anagrams.isAnagram("a", "a"));
        assertFalse(Anagrams.isAnagram("b", "bbb"));
        assertFalse(Anagrams.isAnagram("ccc", "ccccccc"));
        assertFalse(Anagrams.isAnagram("sleep", "slep")); }

}
