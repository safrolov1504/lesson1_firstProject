package demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserApplication {
    public static void main(String[] args) {
        //контектс из которого мы вызываем все функции spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserApplicationConfig.class);

        UserService userService = context.getBean("userService", UserService.class);
        userService.printAllUsers();

        Box box1 = context.getBean("box", Box.class);
        Box box2 = context.getBean("box", Box.class);
        System.out.println(box1.color);
        System.out.println(box2.color);
        box1.color = "Green";
        box2.color = "White";
        System.out.println(box1);
        System.out.println(box2);
    }
}
