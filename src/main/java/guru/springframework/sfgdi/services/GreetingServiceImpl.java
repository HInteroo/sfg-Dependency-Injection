package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World";
    }
}
//we added in the service annotation which tells Spring that this is a
//Spring managed component and to
//bring it into the Spring Context.