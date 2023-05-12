package uz.najottalim.javan6.service;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Profile("dev")
@Service
public class TestDatabaseConnection implements DatabaseConnection {
    public String connectAndGet() {
        return "test data";
    }

    @PostConstruct
    public void myConstruct() {
        IntStream.range(0, 20)
                .forEach(System.out::println);
        System.out.println("tirildm");
    }

    @PreDestroy
    public void myDestroy() {
        IntStream.range(0, 20)
                .forEach(System.out::println);
        System.out.println("o'lyapman");
    }
}
