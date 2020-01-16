package fr.valarep.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import fr.valarep.demo.components.InjectionAvecSetterComponent;
import fr.valarep.demo.components.InjectionDirecteComponent;
import fr.valarep.demo.components.InjectionParConstructeurComponent;
import fr.valarep.demo.services.ServiceBonjourImpl;

@SpringBootTest
class DemoApplicationTests {

	@Test
	public void testInjectionDirecte() {
		InjectionDirecteComponent comp = new InjectionDirecteComponent();
		comp.serviceBonjour = new ServiceBonjourImpl();

		assertEquals("Salut Biloute interfacée!", comp.direBonjour());
	}

	@Test
	public void testInjectionAvecSetter() {
		InjectionAvecSetterComponent comp = new InjectionAvecSetterComponent();
		comp.setServiceBonjour(new ServiceBonjourImpl());

		assertEquals("Salut Biloute interfacée!", comp.direBonjour());
	}

	@Test
	public void testInjectionParConstructeur() {
		InjectionParConstructeurComponent comp = new InjectionParConstructeurComponent(new ServiceBonjourImpl());
		

		assertEquals("Salut Biloute interfacée!", comp.direBonjour());
	}

}
