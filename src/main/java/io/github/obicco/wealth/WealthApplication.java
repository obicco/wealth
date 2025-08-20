package io.github.obicco.wealth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class WealthApplication {

    public static void main(String[] args) {SpringApplication.run(WealthApplication.class, args); }
}