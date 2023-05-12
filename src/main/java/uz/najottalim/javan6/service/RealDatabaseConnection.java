package uz.najottalim.javan6.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service
public class RealDatabaseConnection implements DatabaseConnection {
    public String connectAndGet() {
        return "real data";
    }
}
