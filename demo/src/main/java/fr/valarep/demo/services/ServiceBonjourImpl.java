package fr.valarep.demo.services;

import org.springframework.stereotype.Service;

@Service
public class ServiceBonjourImpl implements ServiceBonjour {

    @Override
    public String bonjour() {
        
        return "Salut Biloute interfacée!";

    }

    
}