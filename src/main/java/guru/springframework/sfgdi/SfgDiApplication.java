package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args); //Spring effectively is saying create a new instance of this class, put it into the context

		MyController myController = (MyController) ctx.getBean("myController"); //By default, .getBean(String s)
		 																		//will always return the class Name
																				//but first letter lower case
		String greetings = myController.sayHello();
		System.out.println(greetings);
	}

}

//Line 14: Hey spring, i want an instance of this from the
//context. Provide me an instance of this bean.
//So the Spring that's how the inversion of control works.
//
//The Spring Framework is managing the construction of myController.
//
//So Spring is providing it.
//
//So I'm not creating a new object there.
//
//I'm asking Spring to provide me an object there.