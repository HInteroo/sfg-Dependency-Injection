package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller; //instantiating the controller object

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService()); //using the setter to inject the greeting service implementation.
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}