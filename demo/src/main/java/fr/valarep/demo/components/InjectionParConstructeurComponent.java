package fr.valarep.demo.components;

import fr.valarep.demo.services.ServiceBonjour;

public class InjectionParConstructeurComponent {

    public ServiceBonjour serviceBonjour;

    public InjectionParConstructeurComponent(ServiceBonjour serviceBonjour) {
        this.serviceBonjour = serviceBonjour;
    }


    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
    
}