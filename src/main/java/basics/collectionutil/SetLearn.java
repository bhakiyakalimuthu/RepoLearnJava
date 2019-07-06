package basics.collectionutil;

import java.util.*;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-27
 */
public class SetLearn {

    public static void main(String[] args) {
        SetLearn setLearn = new SetLearn();
        setLearn.hashSetTest();
        setLearn.linkedHashSetTest();
        setLearn.treeSetTest();
    }

    public void hashSetTest(){
        Set set = new HashSet();
        set.add(null);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(null);

        Iterator iterator = set.iterator();
        System.out.println("hashSetTest");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n ");
    }

    public void linkedHashSetTest(){
        Set set = new LinkedHashSet();
        set.add(null);
        set.add(3);
        set.add(1);
        set.add(2);
        set.add(null);

        Iterator iterator = set.iterator();
        System.out.println("linkedHashSetTest");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n ");
    }

    public void treeSetTest(){
        Set set = new TreeSet();
//        set.add(null);
        set.add(3);
        set.add(1);
        set.add(2);
//        set.add(null);

        Iterator iterator = set.iterator();
        System.out.println("treeSetTest ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("\n ");
    }
}
