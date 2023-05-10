package cl.duoc.msintegracionsvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionsvc.client.InstrumentosDbFeignClient;
import cl.duoc.msintegracionsvc.model.dto.InstrumentoDTO;

@Service
public class InstrumentoService {
    
    @Autowired
    InstrumentosDbFeignClient instrumentosDbFeignClient;

    public List<InstrumentoDTO> obtenerTodosLosInstrumentos(){
        return instrumentosDbFeignClient.findAll();
    }
}
