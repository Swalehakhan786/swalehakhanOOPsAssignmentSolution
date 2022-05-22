
package model;
public class admin_dept extends super_dept {
String departmentName;
String getTodaysWork;
String getWorkDeadline;
public admin_dept() {


}
public String getDepartmentName() {
	return "Admin Department";
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
public String getGetTodaysWork() {
	return "Complete your documents Submission";
}
public void setGetTodaysWork(String getTodaysWork) {
	this.getTodaysWork = getTodaysWork;
}
public String getGetWorkDeadline() {
	return "Complete by EOD";
}
public void setGetWorkDeadline(String getWorkDeadline) {
	this.getWorkDeadline = getWorkDeadline;
}



}
