package dependency_injection;

public class SchoolGrade {
private String math;
private String english;
public String getMath() {
	return math;
}
public void setMath(String math) {
	this.math = math;
}
public String getEnglish() {
	return english;
}
public void setEnglish(String english) {
	this.english = english;
}


public String getGrades()
{
	return "math: " + math + "   english:" + english;
}

}
