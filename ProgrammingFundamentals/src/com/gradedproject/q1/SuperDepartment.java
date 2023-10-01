package com.gradedproject.q1;

public class SuperDepartment {
	public String departmentName() {
		String superDeptName="Super Department";
		return superDeptName;
	}
	protected String getTodaysWork() {
		String superTodaysWork="No work as for now";
		return superTodaysWork;
	}
	protected  String getWorkDeadline() {
		String superWorkDeadline="Nil";
		return superWorkDeadline;
	}
	protected String  isTodayAHoliday() {
		String superHoliday="Today is not a holiday";
		return superHoliday;
	}

}
