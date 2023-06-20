package manager.entity;

/*
 * 
 */

public class Student {
	
	private int stdNo;
	private  String name;
	private  String grade;
	private int score;
	private  String insertDt;
	private  String updateDt;
	
	public Student(int stdNo, String name, String grade, String score, 
			String insertDt, String updateDt) {
		this.stdNo = stdNo;
		this.name = name;
		this.grade = grade;
		this.score = score;
		this.insertDt = insertDt
		this.updateDT = updateDT		
		
	}
	
	public int getStdNo() {
		return stdNo;
	}
	public void setStdNo(int stdNo) {
		this.stdNo = stdNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getInsertDt() {
		return insertDt;
	}
	public void setInsertDt(String insertDt) {
		this.insertDt = insertDt;
	}
	public String getUpdateDt() {
		return updateDt;
	}
	public void setUpdateDt(String updateDt) {
		this.updateDt = updateDt;
	}
	
	
	
	


}
