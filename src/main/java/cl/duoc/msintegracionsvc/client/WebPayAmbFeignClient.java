package cl.duoc.msintegracionsvc.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import cl.duoc.msintegracionsvc.model.dto.WebPayInitTransactionDTO;


@FeignClient(name = "svc-webpay-amb", url = "http://localhost:8383/webpay")
public interface WebPayAmbFeignClient {
    
    @PostMapping(path = "/transactions", produces = {"application/json"})
    public String createTransaction(@RequestHeader("Tbk-Api-Key-Id") String tbkApiKeyId,
                                    @RequestHeader("Tbk-Api-Key-Secret") String tbkApiKeySecret,
                                    @RequestBody WebPayInitTransactionDTO webPayInitTransactionDTO);
}
