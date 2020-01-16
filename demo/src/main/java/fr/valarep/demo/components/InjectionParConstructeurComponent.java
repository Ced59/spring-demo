package fr.valarep.demo.components;

import org.springframework.stereotype.Component;

import fr.valarep.demo.services.ServiceBonjour;

@Component
public class InjectionParConstructeurComponent {

    public ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour serviceBonjour) {
        this.serviceBonjour = serviceBonjour;
    }


    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
    
}