package uz.najottalim.javan6.controller;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.najottalim.javan6.service.DatabaseConnection;
import uz.najottalim.javan6.service.GoodByeService;
import uz.najottalim.javan6.service.GreetingService;

import java.util.stream.IntStream;

@RestController
public class GreetingController {
    //    @Autowired
//    private GreetingService englishService;
//
//    @Autowired
//    public void setEnglishService(GreetingService englishService) {
//        this.englishService = englishService;
//    }
    @Autowired
    private DatabaseConnection databaseConnection;
    private final GreetingService englishService;
    private GoodByeService goodByeService;

    @Autowired
    public void setGoodByeService(GoodByeService goodByeService) {
        this.goodByeService = goodByeService;
    }


    @Autowired
    public GreetingController(GreetingService englishService) {
        this.englishService = englishService;
    }

    @GetMapping("/greeting")
    public String greeting() {

        return englishService.greeting();
    }

    @GetMapping("/goodbye")
    public String goodbye() {
        return goodByeService.sayGoodbye();
    }

    @GetMapping("/get-database-data")
    public String getDatabaseData() {
        return databaseConnection.connectAndGet();
    }

    @PostConstruct
    public void myConstruct() {
        IntStream.range(0, 20)
                .forEach(System.out::println);
        System.out.println(databaseConnection.connectAndGet());
    }


}
