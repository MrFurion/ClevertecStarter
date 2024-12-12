package by.clevertec.clevertecstarter.services;

import by.clevertec.clevertecstarter.annotation.MonitorPerformance;
import org.springframework.stereotype.Service;

@Service
public class MyService {
    @MonitorPerformance
    public void executeTask() throws InterruptedException {
        System.out.println("Start method");
        Thread.sleep(1);
    }
}
