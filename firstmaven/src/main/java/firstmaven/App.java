package firstmaven;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class App {

	public static void main(String[] args) {
		System.out.println("Hello First");
		/*ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");*/
		
		Resource res=new ClassPathResource("config.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Test std=(Test)factory.getBean("test1");
		
		System.out.println(std.getId());
		System.out.println(std.getName());
	}

}
