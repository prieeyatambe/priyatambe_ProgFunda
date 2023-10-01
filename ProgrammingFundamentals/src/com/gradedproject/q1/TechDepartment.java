package com.gradedproject.q1;

public class TechDepartment extends SuperDepartment {
	public String departmentName() {
		String techDeptName="Tech Department";
		return techDeptName;
	}
	protected String getTodaysWork() {
		String techTodaysWork="Complete coding of module 1";
		return techTodaysWork;
	}	
	protected  String  getWorkDeadline() {
		String adminWorkDeadline="Complete it by EOD";
		return adminWorkDeadline;
	}

    protected String getTechStackInformation() {
		String techStackInfo="Core java";
		return techStackInfo;
	}
	protected TechDepartment() {
		// TODO Auto-generated constructor stub
		super.isTodayAHoliday();

	}
}
