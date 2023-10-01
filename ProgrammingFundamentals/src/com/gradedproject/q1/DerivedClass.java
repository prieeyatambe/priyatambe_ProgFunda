package com.gradedproject.q1;

public class DerivedClass {
public static String str="Welcome to ";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminDepartment ad= new AdminDepartment();
		System.out.println(str+ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println();
		//HR Deparment
		HrDepartment hd= new HrDepartment();
		System.out.println(str+hd.departmentName());
		System.out.println(hd.doActivity());
		System.out.println(hd.getTodaysWork());
		System.out.println(hd.getWorkDeadline());
		System.out.println(hd.isTodayAHoliday());
		System.out.println();
		//Tech Department
		TechDepartment td= new TechDepartment();
		System.out.println(str+td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
	}

}
