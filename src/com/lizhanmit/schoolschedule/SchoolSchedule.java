package com.lizhanmit.schoolschedule;

import java.util.*;

public class SchoolSchedule {

	private List classes = new ArrayList();

	public List getClasses() {
		return classes;
	}
	
	public void addClass(SchoolClass schoolClass) {
		classes.add(schoolClass);
	}
}
