package ma.enset.customerservice;

import ma.enset.customerservice.entities.Customer;
import ma.enset.customerservice.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository costumerRepository) {
        return args -> {
            costumerRepository.save(new Customer(null, "Hassan", "hassan@gmail.com"));
            costumerRepository.save(new Customer(null, "Malak", "malak@gmail.com"));
            costumerRepository.save(new Customer(null, "Narjis", "narjis@gmail.com"));
            costumerRepository.save(new Customer(null, "Hind", "hind@gmail.com"));
            costumerRepository.save(new Customer(null, "Fatiza", "fatiza@gmail.com"));
            costumerRepository.findAll().forEach(
                    c -> {
                        System.out.println(c.toString());
                    }
            );
        };
    }
}
