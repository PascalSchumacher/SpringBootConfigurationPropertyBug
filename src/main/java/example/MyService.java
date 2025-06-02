package example;

import org.springframework.stereotype.Component;

import example.Config.MyProperties;

@Component
public class MyService {

    public MyService(MyProperties myProperties){
    }
}
