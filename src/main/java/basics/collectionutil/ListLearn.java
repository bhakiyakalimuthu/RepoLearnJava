package basics.collectionutil;

import java.lang.reflect.Field;
import java.util.*;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-27
 */
public class ListLearn {

    public static void main(String[] args) throws Exception {
    ListLearn listLearn = new ListLearn();
    listLearn.arrayListTest();
//    listLearn.linkedListTest();
//    listLearn.vectorTest();
    }



    public void arrayListTest() throws Exception {
        AbstractList abstractList = new ArrayList();
        List list = new ArrayList(0);
        list.add(null);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(null);

        System.out.println(list.get(1).hashCode());
        Iterator iterator = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void linkedListTest(){
        List list = new LinkedList();
        list.add(null);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(null);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
    public void vectorTest(){
        List list = new Vector();
        list.add(null);
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(null);
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
