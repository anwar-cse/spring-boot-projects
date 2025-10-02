package com.anwar.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import com.anwar.main.model.coder;
import com.anwar.main.config.BeanConfig;

@SpringBootApplication
@Import({BeanConfig.class})
public class JavaBasedSetterInjectionApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(JavaBasedSetterInjectionApplication.class, args);

        coder c1 = (coder)context.getBean("Coder1");
        System.out.println(c1.getName());
        System.out.println(c1.getLanguage());
        System.out.println(c1.getComputer().getBrand());
    }
}
