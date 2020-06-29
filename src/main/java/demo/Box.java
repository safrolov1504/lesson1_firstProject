package demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype") //обозначает, что может быльше одного bean
public class Box {
    @Value("Red") // как инициализация
    public String color;

    @Override
    public String toString() {
        return "Box: " + color;
    }
}
