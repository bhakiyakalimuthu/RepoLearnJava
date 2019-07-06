package basics.collectionutil;

import java.util.*;
import java.util.stream.IntStream;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-04-27
 */
public class PerformanceTest {

    public static void main(String[] args) {
        PerformanceTest pt = new PerformanceTest();
        pt.setTest();
    }

    public void setTest(){
        hashSetTest();
        linkedHashSetTest();
        treeSetTest();
    }


    public void hashSetTest(){
        Random random = new Random();
        HashSet set = new HashSet<PerfObject>(3);
        long startTime = System.nanoTime();
        IntStream.range(0,1000).forEach(i -> {
//            int x = random.nextInt(100-10)+10;
            int x = 5;
            set.add(new PerfObject(x) );
        });
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("HashSet Insertion Time : "  + duration);
    }

    public void linkedHashSetTest(){
        Random random = new Random();
        LinkedHashSet set = new LinkedHashSet(3);
        long startTime = System.nanoTime();
        IntStream.range(0,1000).forEach(i -> {
//            int x = random.nextInt(100-10)+10;
            int x = 5;
            set.add(new PerfObject(x) );
        });
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("LinkedHashSet Insertion Time : "  + duration);
    }

    public void treeSetTest(){
        Random random = new Random();
        TreeSet set = new TreeSet();
        long startTime = System.nanoTime();
        IntStream.range(0,1000).forEach(i -> {
//            int x = random.nextInt(100-10)+10;
            int x = 5;
            set.add(new PerfObject(x) );
        });
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("TreeSet Insertion Time : "  + duration);
    }

    class PerfObject implements Comparable<PerfObject>{
        private final int x;

        public PerfObject(int x){
            this.x = x;
        }

        @Override
        public int compareTo(PerfObject perfObject) {
            return this.x - perfObject.x;
        }
    }
}
