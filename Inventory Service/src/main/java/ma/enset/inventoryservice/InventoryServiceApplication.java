package ma.enset.inventoryservice;

import ma.enset.inventoryservice.entities.Product;
import ma.enset.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }

    @Bean
     CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Computer Desk Top HP",900,3));
            productRepository.save(new Product(null,"Printer Epson",90,3));
            productRepository.save(new Product(null,"MacBook Pro Laptop",1900,3));
            productRepository.findAll().forEach(p->{
                System.out.println(p.toString());
            });
        };
}
}
