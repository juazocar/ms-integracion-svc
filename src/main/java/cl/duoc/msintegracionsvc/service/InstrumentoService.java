package cl.duoc.msintegracionsvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionsvc.client.InstrumentosDbFeignClient;

@Service
public class InstrumentoService {
    
    @Autowired
    InstrumentosDbFeignClient instrumentosDbFeignClient;

    public String getSaludo(){
        return instrumentosDbFeignClient.getSaludo();
    }
}
