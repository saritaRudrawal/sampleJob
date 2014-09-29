package testClass;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestJob {
	public static void main(String[] args) throws Exception {
		new ClassPathXmlApplicationContext("Spring-Quartz.xml");
 
	}
}