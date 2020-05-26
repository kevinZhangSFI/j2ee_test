package dependency_injection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("dependencyBeans.xml");

      Student student = (Student) context.getBean("student");

      student.getGrades();
	   
	 /*  SchoolGrade schoolGrade = new SchoolGrade();
	   schoolGrade.setEnglish("5");
	   schoolGrade.setMath("4");
	   
	   Student student = new Student(schoolGrade);
	   student.setAddress("washing st.");
	   student.setName("Yenan");
       
	   student.getGrades();*/
   }
}