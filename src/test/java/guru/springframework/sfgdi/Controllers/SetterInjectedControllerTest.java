package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController controller; //instantiating the controller object

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new GreetingServiceImpl()); //using the setter to inject the greeting service implementation.
    }

    @Test
    void getGreeting() {

        System.out.println(controller.getGreeting());
    }
}