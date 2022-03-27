package com.greatlearning.department;

public class SuperDepartment {

	public void DepartmentName() {
		System.out.println("Welcome to"+ "Super Department");
		}
	
	public void getTodaysWork() {
		System.out.println("No work as of now");
	}
	public void getWorkDeadline() {
		System.out.println("Nil");
	}
	public void isTodayAHoliday() {
		System.out.println("Today is not a holiday");
	}
	   
	   class AdminDepartment extends SuperDepartment{
		   public void departmentName() {
			   System.out.println("Welcome to"+"Admin Department");
		   }
		   public void getTodaysWork() {
			   System.out.println("Complete your documents submission");
		   }
		   public void getWorkDeadlie() {
			   System.out.println("Complete by EOD");
		   }
	   }
	   
	   class HrDepartment extends SuperDepartment{
		   public void departmentName() {
			   System.out.println("Welcome to"+"Hr Department");
		   }
		   public void getTodaysWork() {
			   System.out.println("Fill today's worksheet and mark your attendance");
		   }
		   public void getWorkDeadline() {
			   System.out.println("Complete by EOD");
		   }
		   public void doactivity() {
			   System.out.println("Team lunch");
		   }
	   }

	   class TechDepartment extends SuperDepartment{
		   public void departmentName() {
			   System.out.println("Welcome to"+"Tech Department");
		   }
		   public void getTodaysWork() {
			   System.out.println("Complete coding of module 1");
		   }
		   public void getWorkDeadline() {
			   System.out.println("Complete by EOD");
		   }
		   public void getTechStackInformation() {
			   System.out.println("Core Java");
		   }
	   }
	  
	
	}
  


