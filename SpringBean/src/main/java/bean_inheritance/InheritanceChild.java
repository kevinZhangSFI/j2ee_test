package bean_inheritance;

public class InheritanceChild extends Father{
	private String middle_name;
	private String school_grade;

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getSchool_grade() {
		return school_grade;
	}

	public void setSchool_grade(String school_grade) {
		this.school_grade = school_grade;
	}
	public void getFullname()
	{
		System.out.println( first_name + " " + middle_name + " " + last_name);
	}
	
	public void getGrade()
	{
		System.out.println(this.school_grade);
	}
}
