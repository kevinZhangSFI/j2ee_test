package sop_test; 
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;
 
public class HijackBeforeMethod implements MethodBeforeAdvice
{
	@Override
	public void before(Method method, Object[] args, Object target)
		throws Throwable {	
		SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
		Date date = new Date(System.currentTimeMillis());
	        System.out.println("begin to withdraw time:" + formatter.format(date));
	}
}