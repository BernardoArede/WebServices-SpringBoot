package pt.ba.web.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import pt.ba.web.entities.Category;
import pt.ba.web.repositories.ICategoryRepository;
import pt.ba.web.status.OrderStatus;
import pt.ba.web.entities.User;
import pt.ba.web.entities.Order;
import pt.ba.web.repositories.IOrderRepository;
import pt.ba.web.repositories.IUserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private ICategoryRepository categoryRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
        
        Order o1 = new Order(null, Instant.parse("2019-06-20T00:57:07Z"), u1, OrderStatus.WAITING_PAYMENT);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), u2, OrderStatus.WAITING_PAYMENT);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), u1, OrderStatus.PAID);

        Category c1 = new Category(null, "Eletronics");
        Category c2 = new Category(null, "Mechanics");
        Category c3 = new Category(null, "Sports");
        userRepository.saveAll(Arrays.asList(u1,u2));
        orderRepository.saveAll(Arrays.asList(o1,o2,o3));
        categoryRepository.saveAll(Arrays.asList(c1,c2,c3));
    }

    

 

    
}
