package basics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;



/**
 * Created by bhakal on 14/01/2019.
 */
public class AndORConditionalCheck {

    public static void main(String[] args) {
        conditionalCheck();
    }

    public static void conditionalCheck(){

        List<String> a = null;
//        List<String> a = new ArrayList<>();
//        a.add(null);
//        a.add("2");


        if(loopCheck(a,"2")){
            System.out.println("success");
        }

    }

//    private  static boolean aBoolean(List a){
//        return a.get(0).toString().equals("1");
//    }

    private static boolean loopCheck(List<String> a, final String item){

//        return a.stream().filter(Objects::nonNull).anyMatch(e -> e.equals(item));
        return a.stream().anyMatch(e -> e.equals(item));

//        for(String x : a){
//            if(x.equals(item)){
//                return true;
//            }
//        }
//        return false;
    }

}
