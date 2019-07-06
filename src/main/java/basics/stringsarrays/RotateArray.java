package basics.stringsarrays;

import java.util.Arrays;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-27
 */
public class RotateArray {
    public static void main(String[] args) {
//        String[] rotatedArray = RotateArray.rotatedArray("hello".split(""));
//        Object[] rotatedArray1 = RotateArray.rotatedArrayObj(new Integer[] {0,1,2,3});
//        System.out.println(Arrays.toString(rotatedArray));
    }


    public static String[] rotatedArray(String[] arr){
        String[] rotatedArr = new String[arr.length];
        String[] tmp = arr;
        for (int i = 0; i < 2; i++) {
            for (int j = tmp.length-1 ; j >=0; j--) {
                if(j ==tmp.length-1 ){
                    rotatedArr[0] = tmp[j];
                }

                if(j !=0){
                    rotatedArr[j] = tmp[j-1];
                }else{
                    rotatedArr[j+1] = tmp[0];
                }
            }
            System.out.println(Arrays.toString(rotatedArr));
            tmp = Arrays.copyOf(rotatedArr,rotatedArr.length);
        }
        return rotatedArr;
    }

    public static Object[] rotatedArrayObj(Object[] arr){
        Object[] rotatedArr = new Object[arr.length];
        Object[] tmp = arr;
//        for (int i = 0; i < 2; i++) {
            for (int j = tmp.length-1 ; j >=0; j--) {
                if(j ==tmp.length-1 ){
                    rotatedArr[0] = tmp[j];
                }

                if(j !=0){
                    rotatedArr[j] = tmp[j-1];
                }else{
                    rotatedArr[j+1] = tmp[0];
                }
            }
            System.out.println(Arrays.toString(rotatedArr));
            tmp = Arrays.copyOf(rotatedArr,rotatedArr.length);
//        }
        return rotatedArr;
    }


}
