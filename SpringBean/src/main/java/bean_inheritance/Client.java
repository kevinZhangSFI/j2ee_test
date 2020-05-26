package bean_inheritance;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
   public static void main(String[] args) {
      ApplicationContext context = 
             new ClassPathXmlApplicationContext("InheritanceBeans.xml");

      Father father = (Father) context.getBean("father");

       father.getFullname();
//Inheritance through Bean configuration 
       InheritanceBeanChild inheritanceBeanChild = (InheritanceBeanChild) context.getBean("inheritanceBeanChild");
       inheritanceBeanChild.getFullname();
       inheritanceBeanChild.getGrade();
/* Inheritance through code
       Father father1 = new Father();
       father1.setFirst_name("David");
       father1.setLast_name("Washington");
       father1.getFullname();
       InheritanceChild inheritanceChild = new InheritanceChild();
       inheritanceChild.setFirst_name("Peter");
       inheritanceChild.setLast_name("Washington");
       inheritanceChild.setMiddle_name("M.");
       inheritanceChild.setSchool_grade("Fourth_Grader");
       inheritanceChild.getFullname();
       inheritanceChild.getGrade();*/
   }
}