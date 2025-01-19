package ufrn.imd.servicebeta1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceBetaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceBetaApplication.class, args);
    }
}