package sop_test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource; 
import sop_test.BankService;
 
public class Client {
	public static void main(String[] args) {
		
	    Resource r=new ClassPathResource("sop_test.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);
	    
	    BankService bankAccount=(BankService) factory.getBean("customerServiceProxy",BankService.class);  
	    bankAccount.setAccountName("Yenan");
	    bankAccount.setBalance(91000);
	    bankAccount.withdraw();
 
	}
}