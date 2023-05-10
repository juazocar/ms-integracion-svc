package cl.duoc.msintegracionsvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.duoc.msintegracionsvc.client.InstrumentosDbFeignClient;
import cl.duoc.msintegracionsvc.client.WebPayAmbFeignClient;
import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;

@Service
public class VentaService {
    
    @Autowired
    WebPayAmbFeignClient webPayAmbFeignClient;

    @Autowired
    InstrumentosDbFeignClient instrumentosDbFeignClient;

    public String generarVenta(WebPayInitTransactionDTO webPayInitTransactionDTO){
        String tbkApiKeyId = "597055555532";
        String tbkApiKeySecret = "579B532A7440BB0C9079DED94D31EA1615BACEB56610332264630D42D0A36B1C";

       String resultado =  webPayAmbFeignClient.createTransaction(tbkApiKeyId, tbkApiKeySecret, webPayInitTransactionDTO);
       
       return "";  
    }
}
