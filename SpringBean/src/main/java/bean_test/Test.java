package bean_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//This is from context
		 ApplicationContext context = 
	             new ClassPathXmlApplicationContext("FirstBean.xml");
		 HelloSFI objTest = (HelloSFI) context.getBean("helloBase");

	       objTest.getMessage1();
	       
	       //this is to call the class
	       
	       HelloSFI helloSFI = new HelloSFI();
	       helloSFI.setSfi_msg("this is from mainclass");
	       helloSFI.getMessage1();
	}

}
