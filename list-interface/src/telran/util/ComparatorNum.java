package telran.util;

import java.util.Comparator;

public class ComparatorNum implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2.compareTo(o1);
	}

}