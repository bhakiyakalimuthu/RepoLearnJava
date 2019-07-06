package basics.collectionutil;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapLearn {

	public static void main(String[] args) {
		mapLearn();
	}

	public static void mapLearn(){
		Map map = new HashMap();

		map.put(1,"kavin");
		map.put(2,"pappa");
		map.put(3,"seetha");
		map.put(4,"kuttipappa");
//		map.put(null,"life");
//		map.put(null,"god");
//		System.out.println(map.get(1).hashCode());
//		System.out.println(map.get(2).hashCode());
//		System.out.println(map.get(3).hashCode());
		System.out.println(map.get(4));
//		System.out.println(map.toString()) ;
//		System.out.println(map.hashCode()) ;
//		System.out.println(map.hashCode()) ;
//		System.out.println(map.get(null));
		System.out.println(map.get(5));

		
	}
}
