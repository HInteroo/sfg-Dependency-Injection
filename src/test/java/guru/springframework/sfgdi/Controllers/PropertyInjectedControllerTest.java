package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {//Manual property injection, Not the best way to do it. Least preferred way.

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() { //Setting up the test condition
        controller = new PropertyInjectedController();              //So I am mimicking what the Spring Framework would be doing. I'm actually creating the object
        controller.greetingService = new ConstructorInjectedGreetingService();     //here, I want to say get the greeting
    }

    @Test
    void getGreeting() { //Run this test
        System.out.println(controller.getGreeting());
    }
}