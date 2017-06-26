package asw.springcloud.s2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class S2Application {

	public static void main(String[] args) {
		SpringApplication.run(S2Application.class, args);
	}
}
