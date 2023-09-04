package app.config;

import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean("cat")
    public Cat getCat() {
        return new Cat();
    }

    @Bean("dog")
    public Dog getDog() {
        return new Dog();
    }

    @Bean("timer")
    public Timer getTimer() {
        return new Timer();
    }
}
