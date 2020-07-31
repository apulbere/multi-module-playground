package org.example;

import lombok.extern.log4j.Log4j2;
import org.example.conversion.PetMapper;
import org.example.domain.MockedPet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Log4j2
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private PetMapper genericMapper;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        var bean = new MockedPet("id1", "jack");
        Pet result = genericMapper.map(bean);

        log.info(result);
    }
}
