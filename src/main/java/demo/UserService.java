package demo;

import demo.User;
import demo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

//анатация, что класс является bean
@Component
public class UserService {
    private UserRepository userRepository;


    //Qualifier - что бы spring правильно выбрал какой класс подразумивается под интерфейсом
    //Autowired - как конструктор
    @Autowired
    public void setInMemoryUserRepository(@Qualifier(value = "inMemoryUserRepository") UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void printAllUsers() {
        List<User> users = userRepository.findAllUsers();
        for (User u : users) {
            System.out.println(u);
        }
    }
}
