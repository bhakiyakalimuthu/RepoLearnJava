package basics.stringsarrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Bhakiyaraj Kalimuthu
 * @date : 2019-05-19
 */
public class MergeIntervals {
	public static void main(String[] args) {

	}

	public List<int[]> mergeIntervals(List<int[]> arrList){
		List<int[]> mergedList = new ArrayList<>();

		for (int i = 0; i < arrList.size(); i++) {
			if(i!=arrList.size()-1){
				for (int j = 0; j < arrList.get(i).length; j++) {
					if(arrList.get(i)[j]+1 == arrList.get(i+1)[j] ){
						if(arrList.get(i)[j+1] == arrList.get(i+1)[j+1] ){
							return null;
						}
					}else if(arrList.get(i)[j]+1 == arrList.get(i+1)[j+1]){
						return null;
					}
				}
			}
		}
		return null;
	}
}
