package basics.stringsarrays;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-05
 */
public class IsStringHasUniqueChar {

    public static void main(String[] args) {
//        IsStringHasUniqueChar.isStringHasUniqueChar("kavin");
        IsStringHasUniqueChar.isStringHasUniqueChar("hello");
    }

    public static boolean isStringHasUniqueChar(String str){
        if(!str.equals(null)) {
            for (int i = 1; i < str.length(); i++) {
                char[] arr = str.substring(i).toCharArray();
                for (char check : arr) {
                    char element = str.charAt(i - 1);
                    if (check == element) {
                        System.out.println("true");
                        return true;
                    }
                }

            }
            System.out.println("false");
            return false;
        }
        System.out.println("null:false");
        return false;
    }
}
