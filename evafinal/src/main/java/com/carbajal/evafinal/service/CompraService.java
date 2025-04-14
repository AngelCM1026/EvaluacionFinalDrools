package com.carbajal.evafinal.service;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

import com.carbajal.evafinal.Compra;

@Service
public class CompraService {

    public Compra verificarCompra(Compra compra) {

        KieServices kieServices = KieServices.Factory.get();
        KieContainer kieContainer = kieServices.getKieClasspathContainer();
        KieSession kieSession = kieContainer.newKieSession("ksession-rules");
    
        
        kieSession.insert(compra);
        kieSession.fireAllRules();
        kieSession.dispose();
    
        return compra;
    }

}
