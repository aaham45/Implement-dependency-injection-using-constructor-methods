package com.example.MyAppApplication;

import com.example.MyAppApplication.component.GreetingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

        GreetingController controller = context.getBean(GreetingController.class);
        controller.showGreeting();
    }
}
