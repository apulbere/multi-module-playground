package org.example;

import lombok.extern.log4j.Log4j2;
import org.example.conversion.GenericMapper;
import org.example.domain.MockedBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;

@Log4j2
@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private GenericMapper genericMapper;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        var bean = new MockedBean("id1", BigDecimal.TEN);
        GenericBean result = genericMapper.map(bean);

        log.info(result);
    }
}
