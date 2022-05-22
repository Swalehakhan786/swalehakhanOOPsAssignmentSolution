package Main;

import java.util.Scanner;

import model.admin_dept;
import model.hr_dept;
import model.super_dept;
import model.tech_dept;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	

	
				admin_dept admin = new admin_dept();
				
				
				System.out.println("welcome to "+admin.getDepartmentName() +"\n"
						+ admin.getGetTodaysWork() + "\n"
						+ admin.getGetWorkDeadline()+ "\n"
						+ admin.getIsTodayAHoliday());

			
				System.out.println("\n");

		
				hr_dept hr = new hr_dept();
				
				
				System.out.println("welcome to "+hr.getDepartmentName() +"\n"
						+ hr.getGetTodaysWork() + "\n"
						+ hr.getGetWorkDeadline() + "\n"
						+ hr.getDoActivity()+ "\n"
						+ hr.getIsTodayAHoliday());


				
				System.out.println("\n");


				tech_dept tech = new tech_dept();
				
				
				System.out.println("welcome to "+tech.getDepartmentName() +"\n"
						+ tech.getGetTodaysWork() + "\n"
						+ tech.getGetWorkDeadline() + "\n"
						+ tech.getGetTechStackInformation() + "\n"
						+ tech.getIsTodayAHoliday());
				
			

				
		
			}
			
	
		
		
		
	

}
