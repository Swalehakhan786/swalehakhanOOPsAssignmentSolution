package model;

public class super_dept {

	String departmentName;
	String getTodaysWork;
	String getWorkDeadline;
	String isTodayAHoliday;
	
	public super_dept() {
		

	}
	public String getDepartmentName() {
		return "Super Department ";
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getGetTodaysWork() {
		return "No Work as of now";
	}
	public void setGetTodaysWork(String getTodaysWork) {
		this.getTodaysWork = getTodaysWork;
	}
	public String getGetWorkDeadline() {
		return  "Nil";
	}
	public void setGetWorkDeadline(String getWorkDeadline) {
		this.getWorkDeadline = getWorkDeadline;
	}
	public String getIsTodayAHoliday() {
		return "Today is not a holiday";
	}
	public void setIsTodayAHoliday(String isTodayAHoliday) {
		this.isTodayAHoliday = isTodayAHoliday;
	}
	
	
}


