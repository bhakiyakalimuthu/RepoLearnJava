package basics.stringsarrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-28
 */
public class Isomorphic {

    public static void main(String[] args) {
        System.out.println(Isomorphic.isomorphic("egg","add"));
        System.out.println(Isomorphic.isomorphic("foo","bar"));
        System.out.println(Isomorphic.isomorphic("paper","title"));
        System.out.println(Isomorphic.isomorphic("andersson","unwritten"));
    }

    public static boolean isomorphic(String str1, String str2){
        Map map1 = new HashMap();
        Map map2 = new HashMap();
        List list1 = Arrays.asList(str1.split(""));
        List list2 = Arrays.asList(str2.split(""));

        if(str1.length() != str2.length()){
            return false;
        }

        for (int i = 0; i <str1.length() ; i++) {
            if (!map1.containsKey(list1.get(i))){
                if(map2.containsKey(list2.get(i))){
                    return false;
                }
                map1.put(list1.get(i),list2.get(i));
                map2.put(list2.get(i),list1.get(i));
            }else if( ! map1.get(list1.get(i)).equals(list2.get(i))){
                return false;
            }
        }
        System.out.println("check :" + map1.equals(map2));
        return true;

    }
}
