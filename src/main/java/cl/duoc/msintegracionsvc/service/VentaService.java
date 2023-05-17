package cl.duoc.msintegracionsvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionsvc.client.InstrumentosDbFeignClient;
import cl.duoc.msintegracionsvc.client.WebPayAmbFeignClient;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class VentaService {
    
    @Autowired
    WebPayAmbFeignClient webPayAmbFeignClient;

    @Autowired
    InstrumentosDbFeignClient instrumentosDbFeignClient;

    @Value("${svc.webpay.id}")
    private String tbkApiKeyId;
    @Value("${svc.webpay.secret}")
    private String tbkApiKeySecret;
    
    
    public String generarVenta(WebPayInitTransactionDTO webPayInitTransactionDTO){
        log.info("Intentando conectar con webservice webpay");
        log.info("tbkApiKeyId: "+tbkApiKeyId);
        log.info("tbkApiKeySecret: "+tbkApiKeySecret);
        String resultado =  webPayAmbFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);
        log.info("Response [generarVenta] :"+resultado);
        return "";  
    }
}
