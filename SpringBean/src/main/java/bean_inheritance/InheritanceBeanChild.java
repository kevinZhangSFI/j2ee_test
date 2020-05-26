package bean_inheritance;

public class InheritanceBeanChild {
	
	private String first_name;
	private String last_name;
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

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
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
