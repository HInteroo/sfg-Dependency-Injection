package guru.springframework.sfgdi;

import guru.springframework.sfgdi.Controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args); //Spring effectively is saying create a new instance of this class, put it into the context
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		MyController myController = (MyController) ctx.getBean("myController"); //By default, .getBean(String s)
		 																		//will always return the class Name
																				//but first letter lower case
		System.out.println("----------- Primary Bean");
		System.out.println(myController.sayHello());

		System.out.println("----------- property"); //added @Controller & @Autowired
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("----------- Setter"); //added @Controller & @Autowired
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("----------- Constructor"); //added @Controller only
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
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