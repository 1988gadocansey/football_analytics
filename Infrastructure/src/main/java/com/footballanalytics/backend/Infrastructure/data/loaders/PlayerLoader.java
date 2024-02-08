package footballanalytics.backend.Infrastructure.data.loaders;

import com.footballanalytics.backend.Application.common.dto.PlayerDTo;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.boot.CommandLineRunner;

import java.util.Arrays;

@AllArgsConstructor
public class PlayerLoader {
    private static final Logger log = LoggerFactory.getLogger(PlayerLoader.class);

    @Bean
    public CommandLineRunner demo(PlayerDTo playerDTo ) {
       /* return (args) -> {
            // save a few players
            playerDao.saveAll(Arrays.asList(new Pla("Jack", "Bauer"),
                            new Customer("Chloe", "O'Brian"),
                            new Customer("Kim", "Bauer"),
                            new Customer("David", "Palmer"),
                            new Customer("Michelle", "Dessler")))
                    .blockLast(Duration.ofSeconds(10));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            repository.findAll().doOnNext(customer -> {
                log.info(customer.toString());
            }).blockLast(Duration.ofSeconds(10));*/
        return  null;
    }

    }
