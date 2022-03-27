package com.greatlearning.main.DriverClass;

public class DriverClass{
		

	public static void main(String[] args) {
		
		
	class AdminDepartment c1 = new AdminDepartment();
	c1.departmentName();
	c1.getTodaysWork();
	c1.getWorkDeadline();
	
	class HrDepartment c2 = new HrDepartment();
	c2.departmentName();
	c2.doActivity();
	c2.getTodaysWork();
	c2.getWorkDeadline();
	c2.isTodayAHoliday();
	
	class TechDepartment c3 = new TechDepartment();
	c3.departmentName();
	c3.getTodaysWork();
	c3.getWorkDeadline();
	c3.getTechStackInformation();
	c3.isTodayAHoliday();
	

	}

}
