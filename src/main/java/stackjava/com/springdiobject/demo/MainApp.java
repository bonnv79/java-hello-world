package stackjava.com.springdiobject.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springdiobject/applicationContext.xml");
		Person person = (Person) context.getBean("person");
		person.print();

	}
}
