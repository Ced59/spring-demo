package fr.valarep.demo.components;

import fr.valarep.demo.services.ServiceBonjour;

public class InjectionDirecteComponent {

    public ServiceBonjour serviceBonjour;

    public String direBonjour() {
        return serviceBonjour.bonjour();
    }
    
}