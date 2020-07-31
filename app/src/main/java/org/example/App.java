package org.example;

import org.example.domain.dto.DtoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.convert.ConversionService;

@SpringBootApplication
public class App implements CommandLineRunner {

    @Autowired
    private ConversionService conversionService;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Override
    public void run(String... args) {
        GenericBean genericBean = conversionService.convert(new DtoBean(), GenericBean.class);
        System.out.println(genericBean);
    }
}
