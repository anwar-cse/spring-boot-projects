package com.anwar.main.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import com.anwar.main.model.coder;
import com.anwar.main.model.computer;

@Configuration
public class BeanConfig {
 
	@Bean
	 public coder Coder1(computer Computer) {
		 coder c1=new coder();
		 c1.setId(1001);
		 c1.setName("Anwar");
		 c1.setLanguage("java");
		 c1.setComputer(Computer);
		 return c1;
	 }
	@Bean
	 public computer Computer1() {
		 computer com1=new computer();
		 com1.setBrand("dell");
		 
		 return com1;
	 }
}
