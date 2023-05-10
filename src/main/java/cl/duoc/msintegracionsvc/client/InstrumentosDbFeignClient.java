package cl.duoc.msintegracionsvc.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import cl.duoc.msintegracionsvc.model.dto.InstrumentoDTO;

@FeignClient(name = "svc-instruments-db", url = "http://localhost:8282/instrumentos-db")
public interface InstrumentosDbFeignClient {
    
    @GetMapping(path = "/get-all", produces = {"application/json"})
    public List<InstrumentoDTO> findAll();
}
