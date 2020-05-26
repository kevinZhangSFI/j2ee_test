package dependency_injection;

public class Student {
	private String name;
	private String address;
	private SchoolGrade schoolGrades;

	public Student(SchoolGrade schoolGrades)
	{
		this.setSchoolGrades(schoolGrades);
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void getGrades()
	{
		System.out.println(name + " " + schoolGrades.getGrades());
	}
	public SchoolGrade getSchoolGrades() {
		return schoolGrades;
	}
	public void setSchoolGrades(SchoolGrade schoolGrades) {
		this.schoolGrades = schoolGrades;
	}

}
