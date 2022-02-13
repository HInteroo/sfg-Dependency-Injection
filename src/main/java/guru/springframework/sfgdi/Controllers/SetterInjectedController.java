package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    public GreetingService greetingService;
    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService = greetingService;
    }
    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
