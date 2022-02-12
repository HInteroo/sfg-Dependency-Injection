package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService; //best practice use private final and then provide a constructor
                                                    //Private so you can't change the object once inside the object code

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
