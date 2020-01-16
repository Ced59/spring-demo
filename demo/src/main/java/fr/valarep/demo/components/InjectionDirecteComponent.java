package fr.valarep.demo.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.valarep.demo.services.ServiceBonjour;

@Component
public class InjectionDirecteComponent {

    @Autowired
    public ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
    
}