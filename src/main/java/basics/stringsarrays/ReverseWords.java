package basics.stringsarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-28
 */
public class ReverseWords {
    public static void main(String[] args) {
        ReverseWords.reverseWords(("life is so beautiful").split(" "));
        ReverseWords.reverseWords(("i love you so much").split(" "));
    }

    public static String[] reverseWords(String[] arr){
        System.out.println(Arrays.toString(arr));
        String[] reversedArr = new String[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0 ; i--) {
            System.out.println(j);
            System.out.println(i);
            reversedArr[j] = arr[i];
            System.out.println(Arrays.toString(reversedArr));
            j = j+1;
        }
        System.out.println(Arrays.toString(reversedArr));
        return reversedArr;
    }

    public static String[] reverseWord1(String[] arr){
        System.out.println(Arrays.toString(arr));
        String[] reversedArr = new String[arr.length];



        return reversedArr;
    }

    @Test
    private void reverseWordsTest(){
        Assertions.assertEquals(new String[]{"beautiful", "so", "is", "life"}, ReverseWords.reverseWords(("life is so beautiful").split("")));
        Assertions.assertEquals(new String[]{"much", "so", "you", "love"}, ReverseWords.reverseWords(("i love you so much").split("")));
    }
}
