package fr.valarep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.valarep.demo.components.ExampleComponent;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		ExampleComponent comp = (ExampleComponent)ctx.getBean("exampleComponent");
		comp.bonjour();
	}

}
