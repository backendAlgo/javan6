package uz.najottalim.javan6.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishService implements GreetingService {
    @Override
    public String greeting() {
        return "Hello";
    }
}
