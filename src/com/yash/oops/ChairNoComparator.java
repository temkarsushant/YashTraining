package com.yash.oops;

import java.util.Comparator;

public class ChairNoComparator implements Comparator<JavaTraining> {

	@Override
	public int compare(JavaTraining m1, JavaTraining m2) {
		if (m1.getChairNo() < m2.getChairNo())
			return 1;
		if (m1.getChairNo() > m2.getChairNo())
			return -1;
		else
			return 0;
	}

}
