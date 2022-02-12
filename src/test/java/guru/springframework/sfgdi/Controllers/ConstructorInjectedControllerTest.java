package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest { //Most preferred method!

    ConstructorInjectedController controller;
    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new GreetingServiceImpl()); //creating a new constructor injected a
                                                                                  // controller and also at the same time I'm creating that greeting service.
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}