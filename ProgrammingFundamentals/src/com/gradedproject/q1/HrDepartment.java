package com.gradedproject.q1;

public class HrDepartment extends SuperDepartment {
	public String departmentName() {
		String hrDeptName="HR Department";
		return hrDeptName;
	}
	protected String getTodaysWork() {
		String hrTodaysWork="Fill out today's timesheet and mark your attendence";
		return hrTodaysWork;
	}	
	protected  String  getWorkDeadline() {
		String adminWorkDeadline="Complete it by EOD";
		return adminWorkDeadline;
	}

	protected String doActivity() {
		String hrDoActivity="Team lunch";
		return hrDoActivity;
	}
	protected void HrDeparment() {
		// TODO Auto-generated constructor stub
		super.isTodayAHoliday();
		
	}

}
