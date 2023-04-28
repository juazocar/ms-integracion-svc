package cl.duoc.msintegracionsvc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "svc-instruments-db", url = "http://localhost:8282/instrumentos-db")
public interface InstrumentosDbFeignClient {
    
    @GetMapping(path = "/saludo", produces = { "application/json" })
    public String getSaludo();
}
