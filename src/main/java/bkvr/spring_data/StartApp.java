package bkvr.spring_data;

import bkvr.spring_data.model.User;
import bkvr.spring_data.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component //um objeto gerenciado pelo spring framework
public class StartApp implements CommandLineRunner {

    //linhas 13 a 17: Ao invés de usar @Autowired para injetar, criamos uma injeção via Construtor, pois facilita para testes.
    private final UserRepository repository;

    public StartApp(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Caio");
        user.setUsername("bkvr");
        user.setPassword("bkvr123");

        repository.save(user);

        for(User u : repository.findAll()) {
            System.out.println(u);
        }
    }
}
