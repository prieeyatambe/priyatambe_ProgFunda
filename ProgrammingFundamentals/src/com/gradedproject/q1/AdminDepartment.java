package com.gradedproject.q1;

public class AdminDepartment extends SuperDepartment {
	public String departmentName() {
		String adminDeptName="Admin Department";
		return adminDeptName;
	}
	protected String getTodaysWork() {
		String adminTodaysWork="Complete your documents submission";
		return adminTodaysWork;
	}
	protected  String  getWorkDeadline() {
		String adminWorkDeadline="Complete it by EOD";
		return adminWorkDeadline;
	}
		public void AdminDeparment() {
		// TODO Auto-generated constructor stub
		super.isTodayAHoliday();
	}

}
