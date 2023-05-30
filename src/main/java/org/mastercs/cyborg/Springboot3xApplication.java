package org.mastercs.cyborg;

import org.mastercs.cyborg.component.SysLogger;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springboot3xApplication {
    private static final int EXIT_CODE = 42;

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot3xApplication.class, args);
        SysLogger.info("SpringBoot应用容器类型：{}", applicationContext.getClass());
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator() {
        return () -> EXIT_CODE;
    }
}
