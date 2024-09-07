package spring.maven.project;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
    	ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
    	Student student1 = (Student) context.getBean("Student1");
    	
    	System.out.println(student1);
    }
}
