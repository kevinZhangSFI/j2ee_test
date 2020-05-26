package applicationContext_container;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
public class MainApp {
public static void main(String[] args) {
ApplicationContext context = new FileSystemXmlApplicationContext
("C:\\workspace\\git\\SpringBean\\src\\main\\resources\\contextContainer.xml");
HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
obj.getMessage();
}
}