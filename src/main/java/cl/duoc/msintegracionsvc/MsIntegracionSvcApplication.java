package cl.duoc.msintegracionsvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsIntegracionSvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsIntegracionSvcApplication.class, args);
	}

}
