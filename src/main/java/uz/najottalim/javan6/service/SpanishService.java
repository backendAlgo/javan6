package uz.najottalim.javan6.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SpanishService implements GreetingService {
    @Override
    public String greeting() {
        return "Hola Mundo - ES";
    }
}
