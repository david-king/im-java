package com.yaoshuo;

import com.yaoshuo.core.config.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({Config.class})
public class ImConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImConfigApplication.class, args);
    }

}
