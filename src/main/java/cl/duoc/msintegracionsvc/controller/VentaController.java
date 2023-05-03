package cl.duoc.msintegracionsvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;
import cl.duoc.msintegracionsvc.service.VentaService;

@RestController
@RequestMapping("/ventas-svc")
public class VentaController {
    
    @Autowired
    VentaService ventaService;

    @PostMapping(path = "/iniciar-trx", produces = {"application/json"})
    public String createTransaction(@RequestBody WebPayInitTransactionDTO webPayInitTransactionDTO){
        return ventaService.generarVenta(webPayInitTransactionDTO);
    }
}
