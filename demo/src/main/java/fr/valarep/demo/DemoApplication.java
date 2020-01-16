package fr.valarep.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import fr.valarep.demo.components.InjectionAvecSetterComponent;
import fr.valarep.demo.components.InjectionDirecteComponent;
import fr.valarep.demo.components.InjectionParConstructeurComponent;


@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		
		InjectionParConstructeurComponent comp = ctx.getBean(InjectionParConstructeurComponent.class);
		System.out.println(comp.direBonjour());

		InjectionAvecSetterComponent comp2 = ctx.getBean(InjectionAvecSetterComponent.class);
		System.out.println(comp2.direBonjour());

		InjectionDirecteComponent comp3 = ctx.getBean(InjectionDirecteComponent.class);
		System.out.println(comp3.direBonjour());
	}

}
