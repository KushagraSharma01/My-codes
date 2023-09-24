package Comparator_Comparable;

import java.util.Comparator;

public class speed_comparator implements Comparator<car>{
	@Override
	public int compare(car o1,car o2) {
		return o1.speed-o2.speed;
	}
}
