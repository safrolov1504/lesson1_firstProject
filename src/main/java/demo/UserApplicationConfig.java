package demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"demo"})
public class UserApplicationConfig {
    //служебный класс  здесь мы можем объявлять классы  bean если это не сделано раньше
}
