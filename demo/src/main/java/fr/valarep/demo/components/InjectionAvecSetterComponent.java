package fr.valarep.demo.components;

import fr.valarep.demo.services.ServiceBonjour;

public class InjectionAvecSetterComponent {

    private ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }

    public void setServiceBonjour(ServiceBonjour service) {
        serviceBonjour = service;
    }
    
}