package by.clevertec.clevertecstarter;

import by.clevertec.clevertecstarter.services.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ClevertecStarterApplication {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = SpringApplication.run(ClevertecStarterApplication.class, args);

        MyService myService = context.getBean(MyService.class);
        myService.executeTask();
    }
}
